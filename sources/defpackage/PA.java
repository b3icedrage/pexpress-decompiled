package defpackage;

import android.view.GestureDetector;
import android.view.View;
import defpackage.AbstractC7347wA;

/* JADX INFO: loaded from: classes.dex */
public abstract class PA<T extends AbstractC7347wA<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public a d;
    public int e;
    public C7482wo0 g;
    public GestureDetector h;
    public AbstractC4754jq i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final /* synthetic */ a[] n;

        static {
            a aVar = new a("NONE", 0);
            d = aVar;
            a aVar2 = new a("DRAG", 1);
            e = aVar2;
            a aVar3 = new a("X_ZOOM", 2);
            g = aVar3;
            a aVar4 = new a("Y_ZOOM", 3);
            h = aVar4;
            a aVar5 = new a("PINCH_ZOOM", 4);
            i = aVar5;
            a aVar6 = new a("ROTATE", 5);
            a aVar7 = new a("SINGLE_TAP", 6);
            j = aVar7;
            a aVar8 = new a("DOUBLE_TAP", 7);
            k = aVar8;
            a aVar9 = new a("LONG_PRESS", 8);
            l = aVar9;
            a aVar10 = new a("FLING", 9);
            m = aVar10;
            n = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) n.clone();
        }
    }
}
