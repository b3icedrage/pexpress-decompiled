package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import defpackage.DialogC5342me;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC5342me(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void setupDialog(@NonNull Dialog dialog, int i) {
        if (!(dialog instanceof DialogC5342me)) {
            super.setupDialog(dialog, i);
            return;
        }
        DialogC5342me dialogC5342me = (DialogC5342me) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC5342me.c().r(1);
    }
}
