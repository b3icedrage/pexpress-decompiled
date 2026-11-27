package defpackage;

import android.view.View;
import com.api.core.SimpleViewModelFragment;
import com.base.feature.account.screens.settings.AccountSettingsPartBase;
import com.base.feature.stub.screens.stub_results.StubResultsFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6273r4 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ SimpleViewModelFragment e;

    public /* synthetic */ ViewOnClickListenerC6273r4(SimpleViewModelFragment simpleViewModelFragment, int i) {
        this.d = i;
        this.e = simpleViewModelFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = ((AccountSettingsPartBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((B4) obj).n();
                break;
            default:
                Object obj2 = ((StubResultsFragment) this.e).i;
                Intrinsics.checkNotNull(obj2);
                ((VT1) obj2).d.a();
                break;
        }
    }
}
