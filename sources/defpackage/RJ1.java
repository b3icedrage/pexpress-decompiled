package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class RJ1 {
    public static final C3451dr1 m = new C3451dr1(0.5f);
    public C6561sS a = new C3522eB1();
    public C6561sS b = new C3522eB1();
    public C6561sS c = new C3522eB1();
    public C6561sS d = new C3522eB1();
    public InterfaceC7807yN e = new A(0.0f);
    public InterfaceC7807yN f = new A(0.0f);
    public InterfaceC7807yN g = new A(0.0f);
    public InterfaceC7807yN h = new A(0.0f);
    public C3498e50 i = new C3498e50();
    public C3498e50 j = new C3498e50();
    public C3498e50 k = new C3498e50();
    public C3498e50 l = new C3498e50();

    public static final class a {

        @NonNull
        public C6561sS a = new C3522eB1();

        @NonNull
        public C6561sS b = new C3522eB1();

        @NonNull
        public C6561sS c = new C3522eB1();

        @NonNull
        public C6561sS d = new C3522eB1();

        @NonNull
        public InterfaceC7807yN e = new A(0.0f);

        @NonNull
        public InterfaceC7807yN f = new A(0.0f);

        @NonNull
        public InterfaceC7807yN g = new A(0.0f);

        @NonNull
        public InterfaceC7807yN h = new A(0.0f);

        @NonNull
        public C3498e50 i = new C3498e50();

        @NonNull
        public C3498e50 j = new C3498e50();

        @NonNull
        public C3498e50 k = new C3498e50();

        @NonNull
        public C3498e50 l = new C3498e50();

        public static float b(C6561sS c6561sS) {
            if (c6561sS instanceof C3522eB1) {
                ((C3522eB1) c6561sS).getClass();
                return -1.0f;
            }
            if (c6561sS instanceof TR) {
                ((TR) c6561sS).getClass();
            }
            return -1.0f;
        }

        @NonNull
        public final RJ1 a() {
            RJ1 rj1 = new RJ1();
            rj1.a = this.a;
            rj1.b = this.b;
            rj1.c = this.c;
            rj1.d = this.d;
            rj1.e = this.e;
            rj1.f = this.f;
            rj1.g = this.g;
            rj1.h = this.h;
            rj1.i = this.i;
            rj1.j = this.j;
            rj1.k = this.k;
            rj1.l = this.l;
            return rj1;
        }
    }

    @NonNull
    public static a a(Context context, int i, int i2, @NonNull InterfaceC7807yN interfaceC7807yN) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C2083Tl1.H);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC7807yN interfaceC7807yNC = c(typedArrayObtainStyledAttributes, 5, interfaceC7807yN);
            InterfaceC7807yN interfaceC7807yNC2 = c(typedArrayObtainStyledAttributes, 8, interfaceC7807yNC);
            InterfaceC7807yN interfaceC7807yNC3 = c(typedArrayObtainStyledAttributes, 9, interfaceC7807yNC);
            InterfaceC7807yN interfaceC7807yNC4 = c(typedArrayObtainStyledAttributes, 7, interfaceC7807yNC);
            InterfaceC7807yN interfaceC7807yNC5 = c(typedArrayObtainStyledAttributes, 6, interfaceC7807yNC);
            a aVar = new a();
            C6561sS c6561sSE = C0564Aa.e(i4);
            aVar.a = c6561sSE;
            a.b(c6561sSE);
            aVar.e = interfaceC7807yNC2;
            C6561sS c6561sSE2 = C0564Aa.e(i5);
            aVar.b = c6561sSE2;
            a.b(c6561sSE2);
            aVar.f = interfaceC7807yNC3;
            C6561sS c6561sSE3 = C0564Aa.e(i6);
            aVar.c = c6561sSE3;
            a.b(c6561sSE3);
            aVar.g = interfaceC7807yNC4;
            C6561sS c6561sSE4 = C0564Aa.e(i7);
            aVar.d = c6561sSE4;
            a.b(c6561sSE4);
            aVar.h = interfaceC7807yNC5;
            return aVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static a b(@NonNull Context context, AttributeSet attributeSet, int i, int i2) {
        A a2 = new A(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2083Tl1.z, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, a2);
    }

    @NonNull
    public static InterfaceC7807yN c(TypedArray typedArray, int i, @NonNull InterfaceC7807yN interfaceC7807yN) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new A(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C3451dr1(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC7807yN;
    }

    public final boolean d(@NonNull RectF rectF) {
        boolean z = this.l.getClass().equals(C3498e50.class) && this.j.getClass().equals(C3498e50.class) && this.i.getClass().equals(C3498e50.class) && this.k.getClass().equals(C3498e50.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof C3522eB1) && (this.a instanceof C3522eB1) && (this.c instanceof C3522eB1) && (this.d instanceof C3522eB1));
    }

    @NonNull
    public final a e() {
        a aVar = new a();
        aVar.a = new C3522eB1();
        aVar.b = new C3522eB1();
        aVar.c = new C3522eB1();
        aVar.d = new C3522eB1();
        aVar.e = new A(0.0f);
        aVar.f = new A(0.0f);
        aVar.g = new A(0.0f);
        aVar.h = new A(0.0f);
        aVar.i = new C3498e50();
        aVar.j = new C3498e50();
        aVar.k = new C3498e50();
        new C3498e50();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        return aVar;
    }
}
