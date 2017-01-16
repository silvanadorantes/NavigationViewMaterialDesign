package com.example.silvanadorantes.navigationviewmaterialdesign;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos.CambiarPasswordFragment;
import com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos.CerrarSesionFragment;
import com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos.InicioFragment;
import com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos.MiCuentaFragment;
import com.example.silvanadorantes.navigationviewmaterialdesign.Fragmentos.OutfitFragment;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private RelativeLayout mContainer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Declaramos nuestro toolbar y lo asignamos como nuestro ActionBar */
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setNavigationIcon(R.drawable.menu);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /* Declaramos nuestro FragmentLayout */
        mContainer = (RelativeLayout) findViewById(R.id.container);

         /* Declaramos nuestro DrawerLayout */
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawerlayout);
        mDrawerLayout.openDrawer(GravityCompat.START);

        /* Declaramos nuestro NavigationView y setNavigationItemSelectedListener*/
        mNavigationView = (NavigationView)findViewById(R.id.navigationview);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {


                String title;
                item.setChecked(true);

                if (mDrawerLayout.isDrawerOpen(mNavigationView)){

                    mDrawerLayout.closeDrawer(GravityCompat.START);
                    switch (item.getItemId()){
                        case R.id.inicio:
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .addToBackStack(null)
                                    .replace(R.id.container, InicioFragment.newInstance())
                                    .commit();

                            title = getString(R.string.title_section1);
                            getSupportActionBar().setTitle(title);
                            Snackbar.make(mContainer, title + " Selected ", Snackbar.LENGTH_LONG).show();
                            break;

                        case R.id.perfil:
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.container, MiCuentaFragment.newInstance())
                                    .commit();

                            title = getString(R.string.title_section2);
                            getSupportActionBar().setTitle(title);
                            Snackbar.make(mContainer, title + " Selected ", Snackbar.LENGTH_LONG).show();
                            break;

                        case R.id.ouffit:
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.container, OutfitFragment.newInstance())
                                    .commit();

                            title = getString(R.string.title_section3);
                            getSupportActionBar().setTitle(title);
                            Snackbar.make(mContainer, title + " Selected ", Snackbar.LENGTH_LONG).show();
                            break;



                        case R.id.cambiar_password:
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .addToBackStack(null)
                                    .replace(R.id.container, CambiarPasswordFragment.newInstance())
                                    .commit();
                            title = getString(R.string.title_section5);
                            getSupportActionBar().setTitle(title);
                            Snackbar.make(mContainer, title + " Selected ", Snackbar.LENGTH_LONG).show();
                            break;

                        case R.id.cerrar_sesion:
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .addToBackStack(null)
                                    .replace(R.id.container, CerrarSesionFragment.newInstance())
                                    .commit();
                            title = getString(R.string.title_section6);
                            getSupportActionBar().setTitle(title);
                            Snackbar.make(mContainer, title + " Selected ", Snackbar.LENGTH_LONG).show();


                            break;
                    }


                }else {
                    mDrawerLayout.openDrawer(GravityCompat.START);
                }


                return true;
            }


        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
