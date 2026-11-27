package defpackage;

import android.view.View;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.account.screens.logout.AccountLogoutPartBase;
import com.base.feature.alertdialog.screen.AlertDialog;
import com.base.feature.profileandsettings.settings.screens.SettingsFragment;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment;
import com.base.feature.webpage.screens.knowledgeBase.KnowledgeBaseFragmentBase;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5007l3 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC5007l3(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ak0, kotlin.jvm.functions.Function0] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = ((AccountLogoutPartBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((AbstractC6479s3) obj).l();
                break;
            case 1:
                AlertDialog alertDialog = (AlertDialog) this.e;
                alertDialog.h.m.invoke();
                alertDialog.dismiss();
                break;
            case 2:
                ((C1650Nx0) this.e).invoke();
                break;
            case 3:
                KnowledgeBaseFragmentBase knowledgeBaseFragmentBase = (KnowledgeBaseFragmentBase) this.e;
                if (knowledgeBaseFragmentBase.requireActivity() instanceof ActivityC1745Pd) {
                    KnowledgeBaseFragmentBase.a aVar = knowledgeBaseFragmentBase.t;
                    aVar.a = false;
                    ?? r0 = aVar.c;
                    if (r0 != 0) {
                        r0.invoke();
                    }
                    knowledgeBaseFragmentBase.requireActivity().getOnBackPressedDispatcher().c();
                }
                break;
            case 4:
                Object obj2 = ((SettingsFragment) this.e).i;
                Intrinsics.checkNotNull(obj2);
                JJ1 jj1 = (JJ1) obj2;
                jj1.getClass();
                jj1.d.a(InterfaceC7385wM0.a.h);
                jj1.e.a();
                break;
            default:
                StopConfirmBottomSheetDialogFragment stopConfirmBottomSheetDialogFragment = (StopConfirmBottomSheetDialogFragment) this.e;
                ReporterApi.a.b(stopConfirmBottomSheetDialogFragment.j, EnumC5028l80.r0, new C7117v5("Yes"), null, 12);
                Object obj3 = stopConfirmBottomSheetDialogFragment.g;
                Intrinsics.checkNotNull(obj3);
                DQ1 dq1 = (DQ1) obj3;
                dq1.getClass();
                C5189lv.k(C8056za.j(dq1), CoroutineContext.Element.a.c(ED.b(), C6266r20.a), new CQ1(dq1, null), 2);
                stopConfirmBottomSheetDialogFragment.dismiss();
                break;
        }
    }
}
