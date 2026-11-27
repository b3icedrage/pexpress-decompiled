package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.base.feature.alertdialog.screen.RateAppDialog;
import com.base.feature.registration.screens.authorization.AuthorizationFragmentBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3853fm implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC3853fm(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = ((AuthorizationFragmentBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((C1146Hm) obj).E(false, true);
                break;
            case 1:
                RateAppDialog rateAppDialog = (RateAppDialog) this.e;
                boolean z = ((C6216qm1) rateAppDialog.i()).h.getStarCount() >= 4;
                C6635sm1 c6635sm1 = rateAppDialog.h;
                if (z) {
                    String str = c6635sm1.p;
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + str));
                        intent.setPackage("com.android.vending");
                        intent.addFlags(268435456);
                        rateAppDialog.requireActivity().startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        e.toString();
                    }
                } else {
                    c6635sm1.q.invoke();
                }
                c6635sm1.r.invoke(Integer.valueOf(((C6216qm1) rateAppDialog.i()).h.getStarCount()), Boolean.valueOf(z));
                rateAppDialog.i = true;
                rateAppDialog.dismiss();
                break;
            default:
                C4935ki c4935ki = (C4935ki) this.e;
                if (c4935ki != null) {
                    c4935ki.invoke();
                }
                break;
        }
    }
}
