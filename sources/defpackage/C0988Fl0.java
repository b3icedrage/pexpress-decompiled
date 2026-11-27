package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: renamed from: Fl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0988Fl0 extends Drawable implements C1300Jl0.b, Animatable, InterfaceC1817Qb {
    public final a d;
    public boolean e;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public final int k;
    public boolean l;
    public Paint m;
    public Rect n;
    public ArrayList o;

    /* JADX INFO: renamed from: Fl0$a */
    public static final class a extends Drawable.ConstantState {
        public final C1300Jl0 a;

        public a(C1300Jl0 c1300Jl0) {
            this.a = c1300Jl0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new C0988Fl0(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new C0988Fl0(this);
        }
    }

    public C0988Fl0() {
        throw null;
    }

    public C0988Fl0(a aVar) {
        this.i = true;
        this.k = -1;
        this.d = aVar;
    }

    @Override // defpackage.InterfaceC1817Qb
    public final void a() {
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // defpackage.C1300Jl0.b
    public final void b() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C1300Jl0 c1300Jl0 = this.d.a;
        C1300Jl0.a aVar = c1300Jl0.i;
        if ((aVar != null ? aVar.i : -1) == c1300Jl0.a.l.c - 1) {
            this.j++;
        }
        int i = this.k;
        if (i == -1 || this.j < i) {
            return;
        }
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC1817Qb.a) this.o.get(i2)).a(this);
            }
        }
        stop();
    }

    @Override // defpackage.InterfaceC1817Qb
    public final void c(@NonNull InterfaceC1817Qb.a aVar) {
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(aVar);
    }

    public final void d() {
        UE.c("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.h);
        C1300Jl0 c1300Jl0 = this.d.a;
        if (c1300Jl0.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.e) {
            return;
        }
        this.e = true;
        if (c1300Jl0.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c1300Jl0.c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c1300Jl0.f) {
            c1300Jl0.f = true;
            c1300Jl0.j = false;
            c1300Jl0.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.h) {
            return;
        }
        if (this.l) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.n == null) {
                this.n = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.n);
            this.l = false;
        }
        C1300Jl0 c1300Jl0 = this.d.a;
        C1300Jl0.a aVar = c1300Jl0.i;
        Bitmap bitmap = aVar != null ? aVar.k : c1300Jl0.l;
        if (this.n == null) {
            this.n = new Rect();
        }
        Rect rect = this.n;
        if (this.m == null) {
            this.m = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.m);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.m == null) {
            this.m = new Paint(2);
        }
        this.m.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.m == null) {
            this.m = new Paint(2);
        }
        this.m.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        UE.c("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.h);
        this.i = z;
        if (!z) {
            this.e = false;
            C1300Jl0 c1300Jl0 = this.d.a;
            ArrayList arrayList = c1300Jl0.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c1300Jl0.f = false;
            }
        } else if (this.g) {
            d();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.g = true;
        this.j = 0;
        if (this.i) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.g = false;
        this.e = false;
        C1300Jl0 c1300Jl0 = this.d.a;
        ArrayList arrayList = c1300Jl0.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c1300Jl0.f = false;
        }
    }
}
