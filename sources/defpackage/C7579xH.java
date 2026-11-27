package defpackage;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7579xH implements InterfaceC7445we2 {

    @Nullable
    public volatile C7368wH a;

    @NotNull
    public final DS0 b;

    public C7579xH(@NotNull DS0 ds0) {
        this.b = ds0;
    }

    public static boolean b(@NotNull C7368wH c7368wH, @NotNull LayoutNode layoutNode, float f, float f2) {
        Rect rectA = c7368wH.a(layoutNode);
        return rectA != null && f >= rectA.getLeft() && f <= rectA.getRight() && f2 >= rectA.getTop() && f2 <= rectA.getBottom();
    }

    @Override // defpackage.InterfaceC7445we2
    @Nullable
    public final C6814te2 a(@NotNull View view, @NotNull Pair pair) {
        if (this.a != null) {
            return null;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new C7368wH(this.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }
}
