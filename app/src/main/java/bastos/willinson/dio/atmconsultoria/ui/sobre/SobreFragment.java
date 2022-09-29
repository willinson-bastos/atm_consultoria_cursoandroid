package bastos.willinson.dio.atmconsultoria.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bastos.willinson.dio.atmconsultoria.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String descricao = "A ATM consuultoria tem como missão apoiar organizações " +
                "que desejam alcançar o sucesso através da excelência em gestão e da busca" +
                " pela qualidade";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br","Envie um e-mail")
                .addWebsite("https://www.google.com.br/","Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("willinson.kevin","Facebook")
                .addInstagram("wiill_bastos","Instagram")
                .addTwitter("willinson.kevin","Twitter")
                .addYoutube("willinson.kevin","Youtube")
                .addGitHub("willinson-bastos","GitHub")
                .addPlayStore("com.shatteredpixel.shatteredpixeldungeon", "Donwload app")

                .addItem(versao)

                .create();
        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }

}
