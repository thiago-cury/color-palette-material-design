package thiagocury.eti.br.colorpalettes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;

public class TelaAbertura extends AppCompatActivity {

    private Button btnRed;
    private Button btnPink;
    private Button btnPurple;
    private Button btnAmber;
    private Button btnBlue;
    private Button btnBlueGrey;
    private Button btnBrown;
    private Button btnCyan;
    private Button btnDeepOrange;
    private Button btnDeepPurple;
    private Button btnGreen;
    private Button btnGrey;
    private Button btnIndigo;
    private Button btnLightBlue;
    private Button btnLightGreen;
    private Button btnLime;
    private Button btnOrange;
    private Button btnTeal;
    private Button btnYellow;

    //Menu
    private Drawer result = null;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_abertura);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnRed = (Button) findViewById(R.id.btnRed);
        btnPink = (Button) findViewById(R.id.btnPink);
        btnPurple = (Button) findViewById(R.id.btnPurple);
        btnAmber = (Button) findViewById(R.id.btnAmber);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnBlueGrey = (Button) findViewById(R.id.btnBlueGrey);
        btnBrown = (Button) findViewById(R.id.btnBrown);
        btnCyan = (Button) findViewById(R.id.btnCyan);
        btnDeepOrange = (Button) findViewById(R.id.btnDeepOrange);
        btnDeepPurple = (Button) findViewById(R.id.btnDeepPurple);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnGrey = (Button) findViewById(R.id.btnGrey);
        btnIndigo = (Button) findViewById(R.id.btnIndigo);
        btnLightBlue = (Button) findViewById(R.id.btnLightBlue);
        btnLightGreen = (Button) findViewById(R.id.btnLightGreen);
        btnLime = (Button) findViewById(R.id.btnLime);
        btnOrange = (Button) findViewById(R.id.btnOrange);
        btnTeal = (Button) findViewById(R.id.btnTeal);
        btnYellow = (Button) findViewById(R.id.btnYellow);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Red.class);
                startActivity(it);
            }
        });

        btnPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Pink.class);
                startActivity(it);
            }
        });

        btnPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Purple.class);
                startActivity(it);
            }
        });

        btnAmber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Amber.class);
                startActivity(it);
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Blue.class);
                startActivity(it);
            }
        });

        btnBlueGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, BlueGray.class);
                startActivity(it);
            }
        });

        btnBrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Brown.class);
                startActivity(it);
            }
        });

        btnCyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Cyan.class);
                startActivity(it);
            }
        });

        btnDeepOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, DeepOrange.class);
                startActivity(it);
            }
        });

        btnDeepPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, DeepPurple.class);
                startActivity(it);
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Green.class);
                startActivity(it);
            }
        });

        btnGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Gray.class);
                startActivity(it);
            }
        });

        btnIndigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Indigo.class);
                startActivity(it);
            }
        });

        btnLightBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, LightBlue.class);
                startActivity(it);
            }
        });

        btnLightGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, LightGreen.class);
                startActivity(it);
            }
        });

        btnLime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Lime.class);
                startActivity(it);
            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Orange.class);
                startActivity(it);
            }
        });

        btnTeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Teal.class);
                startActivity(it);
            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TelaAbertura.this, Yellow.class);
                startActivity(it);
            }
        });


        //##MENU
        //Com o cabeçalho
        //####################### SÓ O CABEÇALHO #######################
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                        //.withHeaderBackground(R.drawable.menulogonew)
                .addProfiles(
                        //new ProfileDrawerItem().withName("Thiago Cury").withEmail("thiagocury@gmail.com").withIcon(getResources().getDrawable(R.mipmap.ic_launcher))
                )
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean currentProfile) {
                        return false;
                    }
                })
                .build();

        //Menu
        //####################### SÓ O MENU #######################
        result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .withAccountHeader(headerResult)
                        //.withSelectedItem(-1) //criar sem deixar pré selecionado
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.menu_tela_abertura).withIdentifier(0).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_amber).withIdentifier(1).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_blue).withIdentifier(2).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_blue_gray).withIdentifier(3).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_brown).withIdentifier(4).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_cyan).withIdentifier(5).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_deep_orange).withIdentifier(6).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_deep_purple).withIdentifier(7).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_gray).withIdentifier(8).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_green).withIdentifier(9).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_indigo).withIdentifier(10).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_light_blue).withIdentifier(11).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_light_green).withIdentifier(12).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_lime).withIdentifier(13).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_orange).withIdentifier(14).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_pink).withIdentifier(15).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_purple).withIdentifier(16).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_red).withIdentifier(17).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_teal).withIdentifier(18).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_tela_yellow).withIdentifier(19).withIcon(R.mipmap.ic_launcher),

                        new PrimaryDrawerItem().withName(R.string.menu_tela_sobre).withIdentifier(30).withIcon(R.mipmap.ic_launcher),
                        new PrimaryDrawerItem().withName(R.string.menu_sair).withIdentifier(40).withIcon(R.mipmap.ic_launcher)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {

                    @Override
                    public boolean onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {

                        switch (iDrawerItem.getIdentifier()) {
                            case 0:
                                //getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                                //result.getActionBarDrawerToggle().setDrawerIndicatorEnabled(true);
                                break;

                            case 1:
                                Intent it1 = new Intent(TelaAbertura.this, Amber.class);
                                startActivity(it1);
                                break;

                            case 2:
                                Intent it2 = new Intent(TelaAbertura.this, Blue.class);
                                startActivity(it2);
                                break;

                            case 3:
                                Intent it3 = new Intent(TelaAbertura.this, BlueGray.class);
                                startActivity(it3);
                                break;

                            case 4:
                                Intent it4 = new Intent(TelaAbertura.this, Brown.class);
                                startActivity(it4);
                                break;

                            case 5:
                                Intent i5 = new Intent(TelaAbertura.this, Cyan.class);
                                startActivity(i5);
                                break;

                            case 6:
                                Intent it6 = new Intent(TelaAbertura.this, DeepOrange.class);
                                startActivity(it6);
                                break;

                            case 7:
                                Intent it7 = new Intent(TelaAbertura.this, DeepPurple.class);
                                startActivity(it7);
                                break;

                            case 8:
                                Intent it8 = new Intent(TelaAbertura.this, Gray.class);
                                startActivity(it8);
                                break;

                            case 9:
                                Intent it9 = new Intent(TelaAbertura.this, Green.class);
                                startActivity(it9);
                                break;

                            case 10:
                                Intent it10 = new Intent(TelaAbertura.this, Indigo.class);
                                startActivity(it10);
                                break;

                            case 11:
                                Intent it11 = new Intent(TelaAbertura.this, LightBlue.class);
                                startActivity(it11);
                                break;

                            case 12:
                                Intent it12 = new Intent(TelaAbertura.this, LightGreen.class);
                                startActivity(it12);
                                break;

                            case 13:
                                Intent it13 = new Intent(TelaAbertura.this, Lime.class);
                                startActivity(it13);
                                break;

                            case 14:
                                Intent it14 = new Intent(TelaAbertura.this, Orange.class);
                                startActivity(it14);
                                break;

                            case 15:
                                Intent it15 = new Intent(TelaAbertura.this, Pink.class);
                                startActivity(it15);
                                break;

                            case 16:
                                Intent it16 = new Intent(TelaAbertura.this, Purple.class);
                                startActivity(it16);
                                break;

                            case 17:
                                Intent it17 = new Intent(TelaAbertura.this, Red.class);
                                startActivity(it17);
                                break;

                            case 18:
                                Intent it18 = new Intent(TelaAbertura.this, Teal.class);
                                startActivity(it18);
                                break;

                            case 19:
                                Intent it19 = new Intent(TelaAbertura.this, Yellow.class);
                                startActivity(it19);
                                break;

                            case 30:
                                Intent it30 = new Intent(TelaAbertura.this, TelaSobre.class);
                                startActivity(it30);
                                break;

                            case 40:
                                onBackPressed();
                                break;
                        }//fecha switch
                        return false;
                    }
                }).withOnDrawerListener(new Drawer.OnDrawerListener() {
                    @Override
                    public void onDrawerOpened(View view) {
                    }

                    @Override
                    public void onDrawerClosed(View view) {
                        //getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                    }

                    @Override
                    public void onDrawerSlide(View view, float v) {
                        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                        //getSupportActionBar().setHomeButtonEnabled(false);
                    }
                })
                .build();
        result.setSelectionByIdentifier(0);//Pré selecionando o primeiro item

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }//fecha onCreate
}//fecha classe