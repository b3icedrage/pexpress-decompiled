package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7565xC0 extends AbstractC5949pX1 {

    @NotNull
    public final InterfaceC5739oX1 a;
    public final InterfaceC1086Gs b;
    public final InterfaceC7761y80 c;

    /* JADX INFO: renamed from: xC0$a */
    @InterfaceC3368dU(c = "coil.memory.InvalidatableTargetDelegate", f = "TargetDelegate.kt", l = {251}, m = "error")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public I70 h;
        public InterfaceC7761y80 i;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C7565xC0.this.b(null, this);
        }
    }

    /* JADX INFO: renamed from: xC0$b */
    @InterfaceC3368dU(c = "coil.memory.InvalidatableTargetDelegate", f = "TargetDelegate.kt", l = {229}, m = "success")
    public static final class b extends LM {
        public /* synthetic */ Object d;
        public int e;
        public VU1 h;
        public InterfaceC7761y80 i;

        public b(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C7565xC0.this.e(null, this);
        }
    }

    public C7565xC0(@NotNull InterfaceC5739oX1 target, @NotNull InterfaceC1086Gs referenceCounter, @NotNull InterfaceC7761y80 eventListener) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.a = target;
        this.b = referenceCounter;
        this.c = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC5949pX1
    @Nullable
    public final Object b(@NotNull I70 i70, @NotNull JM<? super Unit> jm) {
        a aVar;
        I70 i71;
        InterfaceC7761y80 interfaceC7761y80;
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
            C7716xw0 c7716xw0 = i70.b;
            U0 u0 = c7716xw0.l;
            U0 u1 = U0.k;
            InterfaceC5739oX1 interfaceC5739oX1 = this.a;
            Drawable drawable = i70.a;
            if (u0 == u1) {
                interfaceC5739oX1.c(drawable);
            } else if (interfaceC5739oX1 instanceof O42) {
                InterfaceC7761y80 interfaceC7761y81 = this.c;
                interfaceC7761y81.d(c7716xw0);
                aVar.h = i70;
                aVar.i = interfaceC7761y81;
                aVar.e = 1;
                if (u0.p((O42) interfaceC5739oX1, i70) == mn) {
                    return mn;
                }
                i71 = i70;
                interfaceC7761y80 = interfaceC7761y81;
            } else {
                c7716xw0.w.getClass();
                interfaceC5739oX1.c(drawable);
            }
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC7761y80 = aVar.i;
        i71 = aVar.h;
        C1795Pt1.b(obj);
        interfaceC7761y80.g(i71.b);
        return Unit.a;
    }

    @Override // defpackage.AbstractC5949pX1
    @NotNull
    public final InterfaceC5739oX1 c() {
        return this.a;
    }

    @Override // defpackage.AbstractC5949pX1
    public final void d(@Nullable Drawable drawable, @Nullable Bitmap bitmap) {
        if (bitmap != null) {
            this.b.a(bitmap, false);
        }
        this.a.d(drawable);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC5949pX1
    @Nullable
    public final Object e(@NotNull VU1 vu1, @NotNull JM<? super Unit> jm) {
        b bVar;
        VU1 vu2;
        InterfaceC7761y80 interfaceC7761y80;
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
            Bitmap bitmapC = C5189lv.c(vu1);
            if (bitmapC != null) {
                this.b.a(bitmapC, false);
            }
            C7716xw0 c7716xw0 = vu1.b;
            U0 u0 = c7716xw0.l;
            U0 u1 = U0.k;
            InterfaceC5739oX1 interfaceC5739oX1 = this.a;
            Drawable drawable = vu1.a;
            if (u0 == u1) {
                interfaceC5739oX1.a(drawable);
            } else if (interfaceC5739oX1 instanceof O42) {
                InterfaceC7761y80 interfaceC7761y81 = this.c;
                interfaceC7761y81.d(c7716xw0);
                bVar.h = vu1;
                bVar.i = interfaceC7761y81;
                bVar.e = 1;
                if (u0.p((O42) interfaceC5739oX1, vu1) == mn) {
                    return mn;
                }
                vu2 = vu1;
                interfaceC7761y80 = interfaceC7761y81;
            } else {
                c7716xw0.w.getClass();
                interfaceC5739oX1.a(drawable);
            }
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC7761y80 = bVar.i;
        vu2 = bVar.h;
        C1795Pt1.b(obj);
        interfaceC7761y80.g(vu2.b);
        return Unit.a;
    }
}
