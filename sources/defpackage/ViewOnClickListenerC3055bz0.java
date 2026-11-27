package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import com.base.feature.profileandsettings.settings.screens.SettingsFragment;
import com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsBottomSheetDialogFragment;
import com.base.feature.stub.screens.stubgame.StubGameFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3055bz0 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ ViewOnClickListenerC3055bz0(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.e;
        switch (this.d) {
            case 0:
                Object obj = ((IndicatorsDetailsBottomSheetDialogFragment) fragment).g;
                Intrinsics.checkNotNull(obj);
                C4782jz0 c4782jz0 = (C4782jz0) obj;
                c4782jz0.getClass();
                C5189lv.k(C8056za.j(c4782jz0), null, new C4562iz0(c4782jz0, null), 3);
                break;
            case 1:
                Object obj2 = ((ProfileFragmentBase) fragment).i;
                Intrinsics.checkNotNull(obj2);
                AbstractC8090zi1 abstractC8090zi1 = (AbstractC8090zi1) obj2;
                abstractC8090zi1.getClass();
                C5189lv.k(C8056za.j(abstractC8090zi1), null, new C0902Ei1(abstractC8090zi1, null), 3);
                break;
            case 2:
                Object obj3 = ((SettingsFragment) fragment).i;
                Intrinsics.checkNotNull(obj3);
                JJ1 jj1 = (JJ1) obj3;
                jj1.getClass();
                C5189lv.k(C8056za.j(jj1), null, new IJ1(jj1, null), 3);
                break;
            default:
                int i = StubGameFragment.q;
                Object obj4 = ((StubGameFragment) fragment).i;
                Intrinsics.checkNotNull(obj4);
                C4416iT1 c4416iT1 = (C4416iT1) obj4;
                c4416iT1.getClass();
                C5189lv.k(C8056za.j(c4416iT1), null, new C4884kT1(c4416iT1, null), 3);
                break;
        }
    }
}
