package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.g;
import com.api.core.ActivityStateProvider;
import com.base.feature.alertdialog.screen.SimpleAlertDialogWithBinding;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class WK1 implements VK1 {

    @NotNull
    public final X00 a;

    @NotNull
    public final Context b;

    @NotNull
    public final ActivityStateProvider c;

    @NotNull
    public final ArrayList d;

    public WK1(@NotNull X00 dialogFactory, @NotNull Context activityContext, @NotNull ActivityStateProvider activityStateProvider) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Intrinsics.checkNotNullParameter(activityStateProvider, "activityStateProvider");
        this.a = dialogFactory;
        this.b = activityContext;
        this.c = activityStateProvider;
        this.d = new ArrayList();
    }

    @Override // defpackage.VK1
    @Nullable
    public final Boolean a(@NotNull AbstractC1592Nf abstractC1592Nf, @Nullable FragmentManager fragmentManager, @Nullable Integer num) {
        g.b bVar = (g.b) this.c.e.d.getValue();
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!bVar.b(g.b.i)) {
            return Boolean.FALSE;
        }
        SimpleAlertDialogWithBinding simpleAlertDialogWithBindingA = this.a.a(abstractC1592Nf.a);
        if (fragmentManager == null) {
            Context context = this.b;
            Intrinsics.c(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            fragmentManager = ((ActivityC1745Pd) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
        }
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        String strE = simpleAlertDialogWithBindingA.e();
        if (num == null) {
            simpleAlertDialogWithBindingA.show(fragmentManager, strE);
        } else {
            fragmentManager.getClass();
            a aVar = new a(fragmentManager);
            Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction()");
            aVar.c(num.intValue(), simpleAlertDialogWithBindingA, strE, 1);
            aVar.e(true);
        }
        this.d.add(simpleAlertDialogWithBindingA);
        return Boolean.TRUE;
    }
}
