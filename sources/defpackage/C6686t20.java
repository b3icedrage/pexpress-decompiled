package defpackage;

import android.graphics.Rect;
import android.view.DisplayCutout;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: t20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6686t20 {
    public final DisplayCutout a;

    /* JADX INFO: renamed from: t20$a */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C6686t20(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6686t20.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C6686t20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
