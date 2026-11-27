package defpackage;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.g;
import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.account.screens.settings.AccountSettingsPartBase;
import com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6903u4 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC6903u4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = ((AccountSettingsPartBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((B4) obj).m();
                break;
            case 1:
                AuthorizationFragmentImpl authorizationFragmentImpl = (AuthorizationFragmentImpl) this.e;
                Object obj2 = authorizationFragmentImpl.i;
                Intrinsics.checkNotNull(obj2);
                C2084Tm c2084Tm = (C2084Tm) obj2;
                c2084Tm.getClass();
                ReporterApi.a.b(c2084Tm.I, EnumC5028l80.V0, null, null, 14);
                Object obj3 = authorizationFragmentImpl.i;
                Intrinsics.checkNotNull(obj3);
                C2084Tm.G((C2084Tm) obj3, new CaptchaDestination.Login(0), new C6399rg(authorizationFragmentImpl, 1), 6);
                break;
            case 2:
                C7567xD c7567xD = (C7567xD) this.e;
                EditText editText = c7567xD.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c7567xD.q();
                    break;
                }
                break;
            case 3:
                ((C5488nK) this.e).invoke();
                break;
            case 4:
                Object obj4 = ((SelectHaveAccountFragmentBase) this.e).i;
                Intrinsics.checkNotNull(obj4);
                UE1 ue1 = (UE1) obj4;
                ue1.d.b();
                C5189lv.k(C3784fT.a, C6266r20.c, new TE1(ue1, null), 2);
                break;
            default:
                g gVar = (g) this.e;
                if (gVar instanceof ActivityC1745Pd) {
                    ((ActivityC1745Pd) gVar).getOnBackPressedDispatcher().c();
                }
                break;
        }
    }
}
