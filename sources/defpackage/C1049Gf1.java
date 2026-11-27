package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1049Gf1 extends AbstractC5949pX1 {

    @NotNull
    public final InterfaceC1127Hf1<?> a;
    public final InterfaceC1086Gs b;
    public final InterfaceC7761y80 c;

    /* JADX INFO: renamed from: Gf1$a */
    @InterfaceC3368dU(c = "coil.memory.PoolableTargetDelegate", f = "TargetDelegate.kt", l = {275, 299}, m = "error")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public Object h;
        public Object i;
        public InterfaceC7761y80 j;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C1049Gf1.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: Gf1$b */
    @InterfaceC3368dU(c = "coil.memory.PoolableTargetDelegate", f = "TargetDelegate.kt", l = {235, 248}, m = "success")
    public static final class b extends LM {
        public /* synthetic */ Object d;
        public int e;
        public Object h;
        public Object i;
        public VU1 j;
        public InterfaceC7761y80 k;

        public b(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C1049Gf1.this.e(null, this);
        }
    }

    public C1049Gf1(@NotNull InterfaceC1127Hf1 target, @NotNull InterfaceC1086Gs referenceCounter, @NotNull InterfaceC7761y80 eventListener) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.a = target;
        this.b = referenceCounter;
        this.c = eventListener;
    }

    public static final void f(C1049Gf1 tag, Bitmap bitmap) {
        ViewOnAttachStateChangeListenerC8075ze2 viewOnAttachStateChangeListenerC8075ze2B = C4316i.b(tag.a.e());
        Intrinsics.checkNotNullParameter(tag, "tag");
        C2703aM1<Object, Bitmap> c2703aM1 = viewOnAttachStateChangeListenerC8075ze2B.i;
        Bitmap bitmapPut = bitmap != null ? c2703aM1.put(tag, bitmap) : c2703aM1.remove(tag);
        if (bitmapPut != null) {
            tag.b.b(bitmapPut);
        }
    }

    @Override // defpackage.AbstractC5949pX1
    public final void a() {
        boolean z = this.b instanceof C3712f60;
        InterfaceC1127Hf1<?> interfaceC1127Hf1 = this.a;
        if (z) {
            interfaceC1127Hf1.f();
        } else {
            interfaceC1127Hf1.f();
            f(this, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC5949pX1
    @Nullable
    public final Object b(@NotNull I70 i70, @NotNull JM<? super Unit> jm) {
        a aVar;
        C1049Gf1 c1049Gf1;
        I70 i71;
        InterfaceC7761y80 interfaceC7761y80;
        I70 i72;
        InterfaceC7761y80 interfaceC7761y81;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((LM) jm);
            }
        } else {
            aVar = new a((LM) jm);
        }
        Object obj = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            boolean z = this.b instanceof C3712f60;
            U0 u0 = U0.k;
            InterfaceC7761y80 interfaceC7761y82 = this.c;
            InterfaceC1127Hf1<?> interfaceC1127Hf1 = this.a;
            if (z) {
                C7716xw0 c7716xw0 = i70.b;
                U0 u1 = c7716xw0.l;
                Drawable drawable = i70.a;
                if (u1 == u0) {
                    interfaceC1127Hf1.c(drawable);
                } else if (interfaceC1127Hf1 instanceof O42) {
                    interfaceC7761y82.d(c7716xw0);
                    aVar.h = i70;
                    aVar.i = interfaceC7761y82;
                    aVar.e = 1;
                    if (u1.p((O42) interfaceC1127Hf1, i70) != mn) {
                        i72 = i70;
                        interfaceC7761y81 = interfaceC7761y82;
                        interfaceC7761y81.g(i72.b);
                    }
                } else {
                    c7716xw0.w.getClass();
                    interfaceC1127Hf1.c(drawable);
                }
            } else {
                C7716xw0 c7716xw1 = i70.b;
                U0 u2 = c7716xw1.l;
                Drawable drawable2 = i70.a;
                if (u2 == u0) {
                    interfaceC1127Hf1.c(drawable2);
                } else if (interfaceC1127Hf1 instanceof O42) {
                    interfaceC7761y82.d(c7716xw1);
                    aVar.h = this;
                    aVar.i = i70;
                    aVar.j = interfaceC7761y82;
                    aVar.e = 2;
                    if (u2.p((O42) interfaceC1127Hf1, i70) != mn) {
                        c1049Gf1 = this;
                        i71 = i70;
                        interfaceC7761y80 = interfaceC7761y82;
                        interfaceC7761y80.g(i71.b);
                        f(c1049Gf1, null);
                    }
                } else {
                    c7716xw1.w.getClass();
                    interfaceC1127Hf1.c(drawable2);
                }
                c1049Gf1 = this;
                f(c1049Gf1, null);
            }
            return mn;
        }
        if (i2 == 1) {
            interfaceC7761y81 = (InterfaceC7761y80) aVar.i;
            i72 = (I70) aVar.h;
            C1795Pt1.b(obj);
            interfaceC7761y81.g(i72.b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7761y80 = aVar.j;
            i71 = (I70) aVar.i;
            c1049Gf1 = (C1049Gf1) aVar.h;
            C1795Pt1.b(obj);
            interfaceC7761y80.g(i71.b);
            f(c1049Gf1, null);
        }
        return Unit.a;
    }

    @Override // defpackage.AbstractC5949pX1
    public final InterfaceC5739oX1 c() {
        return this.a;
    }

    @Override // defpackage.AbstractC5949pX1
    public final void d(@Nullable Drawable drawable, @Nullable Bitmap bitmap) {
        InterfaceC1086Gs interfaceC1086Gs = this.b;
        boolean z = interfaceC1086Gs instanceof C3712f60;
        InterfaceC1127Hf1<?> interfaceC1127Hf1 = this.a;
        if (z) {
            interfaceC1127Hf1.d(drawable);
            return;
        }
        if (bitmap != null) {
            interfaceC1086Gs.c(bitmap);
        }
        interfaceC1127Hf1.d(drawable);
        f(this, bitmap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC5949pX1
    @Nullable
    public final Object e(@NotNull VU1 vu1, @NotNull JM<? super Unit> jm) {
        b bVar;
        Bitmap bitmapC;
        C1049Gf1 c1049Gf1;
        VU1 vu2;
        InterfaceC7761y80 interfaceC7761y80;
        VU1 vu3;
        InterfaceC7761y80 interfaceC7761y81;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.e = i - Integer.MIN_VALUE;
            } else {
                bVar = new b((LM) jm);
            }
        } else {
            bVar = new b((LM) jm);
        }
        Object obj = bVar.d;
        MN mn = MN.d;
        int i2 = bVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            bitmapC = C5189lv.c(vu1);
            InterfaceC1086Gs interfaceC1086Gs = this.b;
            boolean z = interfaceC1086Gs instanceof C3712f60;
            U0 u0 = U0.k;
            InterfaceC7761y80 interfaceC7761y82 = this.c;
            InterfaceC1127Hf1<?> interfaceC1127Hf1 = this.a;
            if (z) {
                C7716xw0 c7716xw0 = vu1.b;
                U0 u1 = c7716xw0.l;
                Drawable drawable = vu1.a;
                if (u1 == u0) {
                    interfaceC1127Hf1.a(drawable);
                } else if (interfaceC1127Hf1 instanceof O42) {
                    interfaceC7761y82.d(c7716xw0);
                    bVar.h = vu1;
                    bVar.i = interfaceC7761y82;
                    bVar.e = 1;
                    if (u1.p((O42) interfaceC1127Hf1, vu1) != mn) {
                        vu3 = vu1;
                        interfaceC7761y81 = interfaceC7761y82;
                        interfaceC7761y81.g(vu3.b);
                    }
                } else {
                    c7716xw0.w.getClass();
                    interfaceC1127Hf1.a(drawable);
                }
            } else {
                if (bitmapC != null) {
                    interfaceC1086Gs.c(bitmapC);
                }
                C7716xw0 c7716xw1 = vu1.b;
                U0 u2 = c7716xw1.l;
                Drawable drawable2 = vu1.a;
                if (u2 == u0) {
                    interfaceC1127Hf1.a(drawable2);
                } else if (interfaceC1127Hf1 instanceof O42) {
                    interfaceC7761y82.d(c7716xw1);
                    bVar.h = this;
                    bVar.i = bitmapC;
                    bVar.j = vu1;
                    bVar.k = interfaceC7761y82;
                    bVar.e = 2;
                    if (u2.p((O42) interfaceC1127Hf1, vu1) != mn) {
                        c1049Gf1 = this;
                        vu2 = vu1;
                        interfaceC7761y80 = interfaceC7761y82;
                        interfaceC7761y80.g(vu2.b);
                        f(c1049Gf1, bitmapC);
                    }
                } else {
                    c7716xw1.w.getClass();
                    interfaceC1127Hf1.a(drawable2);
                }
                c1049Gf1 = this;
                f(c1049Gf1, bitmapC);
            }
            return mn;
        }
        if (i2 == 1) {
            interfaceC7761y81 = (InterfaceC7761y80) bVar.i;
            vu3 = (VU1) bVar.h;
            C1795Pt1.b(obj);
            interfaceC7761y81.g(vu3.b);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7761y80 = bVar.k;
            vu2 = bVar.j;
            bitmapC = (Bitmap) bVar.i;
            c1049Gf1 = (C1049Gf1) bVar.h;
            C1795Pt1.b(obj);
            interfaceC7761y80.g(vu2.b);
            f(c1049Gf1, bitmapC);
        }
        return Unit.a;
    }
}
