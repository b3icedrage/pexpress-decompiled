package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3458du implements InterfaceC6265r2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetBehavior b;

    public C3458du(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.InterfaceC6265r2
    public final boolean a(@NonNull View view) {
        this.b.C(this.a);
        return true;
    }
}
