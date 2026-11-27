package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class EW1 implements InterfaceC6265r2 {
    public final /* synthetic */ SwipeDismissBehavior a;

    public EW1(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.InterfaceC6265r2
    public final boolean a(@NonNull View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        e eVar = swipeDismissBehavior.b;
        if (eVar != null) {
            eVar.a(view);
        }
        return true;
    }
}
