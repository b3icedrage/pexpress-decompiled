package defpackage;

import android.view.View;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.alertdialog.screen.AlertDialog;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import com.base.feature.profileandsettings.settings.screens.SettingsFragment;
import com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment;
import com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment;
import com.base.feature.stub.screens.stubgame.StubGameFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6713t9 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC6713t9(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) obj;
                alertDialog.h.l.invoke();
                alertDialog.dismiss();
                break;
            case 1:
                Object obj2 = ((ForgetPasswordFragment) obj).i;
                Intrinsics.checkNotNull(obj2);
                ((C7455wh0) obj2).p();
                break;
            case 2:
                Object obj3 = ((IndicatorsDetailsBottomSheetDialogFragment) obj).g;
                Intrinsics.checkNotNull(obj3);
                C4782jz0 c4782jz0 = (C4782jz0) obj3;
                c4782jz0.getClass();
                C5189lv.k(C8056za.j(c4782jz0), null, new C4992kz0(c4782jz0, null), 3);
                break;
            case 3:
                Object obj4 = ((ProfileFragmentBase) obj).i;
                Intrinsics.checkNotNull(obj4);
                AbstractC8090zi1 abstractC8090zi1 = (AbstractC8090zi1) obj4;
                abstractC8090zi1.getClass();
                C5189lv.k(C8056za.j(abstractC8090zi1), null, new C0746Ci1(abstractC8090zi1, null), 3);
                ReporterApi.a.b(abstractC8090zi1.i, EnumC5028l80.C0, null, WE.f(EnumC5326ma.g, EnumC5326ma.e), 8);
                break;
            case 4:
                Object obj5 = ((SettingsFragment) obj).i;
                Intrinsics.checkNotNull(obj5);
                JJ1 jj1 = (JJ1) obj5;
                jj1.getClass();
                C5189lv.k(C8056za.j(jj1), null, new HJ1(jj1, null), 3);
                break;
            case 5:
                C5189lv.k(C3784fT.a, null, new C6338rN1((AbstractC5709oN1) obj, null), 3);
                break;
            case 6:
                ((IQ1) obj).h.h.toggle();
                break;
            default:
                int i = StubGameFragment.q;
                Object obj6 = ((StubGameFragment) obj).i;
                Intrinsics.checkNotNull(obj6);
                C4416iT1 c4416iT1 = (C4416iT1) obj6;
                c4416iT1.getClass();
                C5189lv.k(C8056za.j(c4416iT1), null, new C5094lT1(c4416iT1, null), 3);
                break;
        }
    }
}
