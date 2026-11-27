package defpackage;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7368wH {
    public final Field a;

    @NotNull
    public final DS0 b;

    public C7368wH(@NotNull DS0 ds0) {
        this.a = null;
        this.b = ds0;
        try {
            Field declaredField = Class.forName("androidx.compose.ui.node.LayoutNode").getDeclaredField("layoutDelegate");
            this.a = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            ds0.info("Could not find LayoutNode.layoutDelegate field");
        }
    }

    @Nullable
    public final Rect a(@NotNull LayoutNode layoutNode) {
        Field field = this.a;
        if (field != null) {
            try {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = (LayoutNodeLayoutDelegate) field.get(layoutNode);
                if (layoutNodeLayoutDelegate != null) {
                    return LayoutCoordinatesKt.boundsInWindow(layoutNodeLayoutDelegate.getOuterCoordinator().getCoordinates());
                }
            } catch (Exception unused) {
                this.b.warn("Could not fetch position for LayoutNode");
                return null;
            }
        }
        return null;
    }
}
