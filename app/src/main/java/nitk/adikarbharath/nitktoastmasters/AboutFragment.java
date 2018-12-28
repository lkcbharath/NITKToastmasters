package nitk.adikarbharath.nitktoastmasters;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_about,container,false);
        TextView versionName = v.findViewById(R.id.textView_versionName);
        String version = "Version " + BuildConfig.VERSION_NAME + " (beta release)";
        versionName.setText(version);
        return v;
    }
}
