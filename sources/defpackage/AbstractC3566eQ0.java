package defpackage;

import android.graphics.drawable.Drawable;
import defpackage.C3506e70;

/* JADX INFO: renamed from: eQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3566eQ0<T extends C3506e70> extends AS<Object> implements InterfaceC4086gt0<T>, InterfaceC4296ht0<Object>, InterfaceC3035bs0<Object> {
    public float A;
    public boolean B;
    public int t;
    public boolean u;
    public boolean v;
    public float w;
    public int x;
    public Drawable y;
    public int z;

    @Override // defpackage.InterfaceC4086gt0
    public final boolean A() {
        return this.B;
    }

    @Override // defpackage.InterfaceC3035bs0
    public final int Q() {
        return this.t;
    }

    @Override // defpackage.InterfaceC4296ht0
    public final boolean Y() {
        return this.u;
    }

    @Override // defpackage.InterfaceC4296ht0
    public final boolean a0() {
        return this.v;
    }

    @Override // defpackage.InterfaceC4086gt0
    public final int c() {
        return this.x;
    }

    @Override // defpackage.InterfaceC4086gt0
    public final int d() {
        return this.z;
    }

    @Override // defpackage.InterfaceC4086gt0
    public final float h() {
        return this.A;
    }

    public final void i0(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.A = AbstractC8067zc2.c(f);
    }

    @Override // defpackage.InterfaceC4296ht0
    public final float n() {
        return this.w;
    }

    @Override // defpackage.InterfaceC4086gt0
    public final Drawable s() {
        return this.y;
    }
}
