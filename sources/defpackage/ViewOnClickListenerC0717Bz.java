package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.api.core.BaseFragment;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.changelanguage.screens.changelanguage.ChangeLanguageFragmentRepeat;
import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import com.base.feature.robot.utils.recyclerbottomsheet.RobotRecyclerBottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0717Bz implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ ViewOnClickListenerC0717Bz(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.e;
        switch (this.d) {
            case 0:
                ChangeLanguageFragmentRepeat changeLanguageFragmentRepeat = (ChangeLanguageFragmentRepeat) fragment;
                Fragment fragment2 = (Fragment) changeLanguageFragmentRepeat.p.w.d.getValue();
                if (fragment2 instanceof BaseFragment) {
                    BaseFragment baseFragment = (BaseFragment) fragment2;
                    String str = baseFragment.e;
                    EnumC2679aE1[] enumC2679aE1Arr = EnumC2679aE1.d;
                    boolean zA = Intrinsics.a(str, "Settings");
                    ReporterApi reporterApi = changeLanguageFragmentRepeat.q;
                    if (zA) {
                        EnumC5028l80 enumC5028l80 = EnumC5028l80.n;
                        L80 l80 = L80.MAX_PROFIT;
                        ReporterApi.a.b(reporterApi, enumC5028l80, new C1510Md1("Account"), null, 12);
                    } else {
                        ReporterApi.a.b(reporterApi, EnumC5028l80.n, new C1510Md1(baseFragment.e), null, 12);
                    }
                    C5189lv.k(C7652xe.f(changeLanguageFragmentRepeat), null, new C0795Cz(changeLanguageFragmentRepeat, null), 3);
                    break;
                }
                break;
            case 1:
                Object obj = ((RobotAccountSelectionPart) fragment).i;
                Intrinsics.checkNotNull(obj);
                C1798Pu1 c1798Pu1 = (C1798Pu1) obj;
                c1798Pu1.getClass();
                C6561sS.g(c1798Pu1, new C1954Ru1(c1798Pu1, null));
                break;
            default:
                Intrinsics.checkNotNull(view);
                ((RobotRecyclerBottomSheetDialogFragment) fragment).getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                break;
        }
    }
}
