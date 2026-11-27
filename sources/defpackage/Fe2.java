package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Fe2 {

    public class a implements K81 {
        public final /* synthetic */ b d;
        public final /* synthetic */ c e;

        public a(b bVar, c cVar) {
            this.d = bVar;
            this.e = cVar;
        }

        @Override // defpackage.K81
        public final C3006bj2 N(View view, C3006bj2 c3006bj2) {
            c cVar = new c();
            c cVar2 = this.e;
            cVar.a = cVar2.a;
            cVar.b = cVar2.b;
            cVar.c = cVar2.c;
            cVar.d = cVar2.d;
            return this.d.a(view, c3006bj2, cVar);
        }
    }

    public interface b {
        C3006bj2 a(View view, C3006bj2 c3006bj2, c cVar);
    }

    public static class c {
        public int a;
        public int b;
        public int c;
        public int d;
    }

    public static void a(@NonNull View view, @NonNull b bVar) {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        c cVar = new c();
        cVar.a = paddingStart;
        cVar.b = paddingTop;
        cVar.c = paddingEnd;
        cVar.d = paddingBottom;
        Cd2.d.u(view, new a(bVar, cVar));
        if (view.isAttachedToWindow()) {
            Cd2.c.c(view);
        } else {
            view.addOnAttachStateChangeListener(new Ge2());
        }
    }

    public static float b(@NonNull Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean c(View view) {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
