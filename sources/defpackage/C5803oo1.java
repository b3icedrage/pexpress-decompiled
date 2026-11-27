package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5803oo1 implements TB0.a {

    @NotNull
    public final C7716xw0 a;

    @NotNull
    public final ArrayList b;
    public final int c;

    @NotNull
    public final C7716xw0 d;

    @NotNull
    public final LM1 e;

    @Nullable
    public final Bitmap f;

    @NotNull
    public final InterfaceC7761y80 g;

    public C5803oo1(@NotNull C7716xw0 initialRequest, @NotNull ArrayList interceptors, int i, @NotNull C7716xw0 request, @NotNull LM1 size, @Nullable Bitmap bitmap, @NotNull InterfaceC7761y80 eventListener) {
        Intrinsics.checkNotNullParameter(initialRequest, "initialRequest");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.a = initialRequest;
        this.b = interceptors;
        this.c = i;
        this.d = request;
        this.e = size;
        this.f = bitmap;
        this.g = eventListener;
    }

    public final void a(C7716xw0 c7716xw0, TB0 tb0) {
        Context context = c7716xw0.a;
        C7716xw0 c7716xw1 = this.a;
        if (!(context == c7716xw1.a)) {
            throw new IllegalStateException(("Interceptor '" + tb0 + "' cannot modify the request's context.").toString());
        }
        if (!(c7716xw0.b != UE.e)) {
            throw new IllegalStateException(("Interceptor '" + tb0 + "' cannot set the request's data to null.").toString());
        }
        if (!(c7716xw0.c == c7716xw1.c)) {
            throw new IllegalStateException(("Interceptor '" + tb0 + "' cannot modify the request's target.").toString());
        }
        if (!(c7716xw0.h == c7716xw1.h)) {
            throw new IllegalStateException(("Interceptor '" + tb0 + "' cannot modify the request's lifecycle.").toString());
        }
        if (c7716xw0.i == c7716xw1.i) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + tb0 + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull C7716xw0 c7716xw0, @NotNull LM lm) {
        C5383mo1 c5383mo1;
        C5803oo1 c5803oo1;
        TB0 tb0;
        if (lm instanceof C5383mo1) {
            c5383mo1 = (C5383mo1) lm;
            int i = c5383mo1.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5383mo1.e = i - Integer.MIN_VALUE;
            } else {
                c5383mo1 = new C5383mo1(this, lm);
            }
        } else {
            c5383mo1 = new C5383mo1(this, lm);
        }
        Object objA = c5383mo1.d;
        MN mn = MN.d;
        int i2 = c5383mo1.e;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            ArrayList arrayList = this.b;
            int i3 = this.c;
            if (i3 > 0) {
                a(c7716xw0, (TB0) arrayList.get(i3 - 1));
            }
            TB0 tb1 = (TB0) arrayList.get(i3);
            InterfaceC7761y80 interfaceC7761y80 = this.g;
            C5803oo1 c5803oo2 = new C5803oo1(this.a, arrayList, i3 + 1, c7716xw0, this.e, this.f, interfaceC7761y80);
            c5383mo1.h = this;
            c5383mo1.i = tb1;
            c5383mo1.e = 1;
            objA = tb1.a(c5803oo2, c5383mo1);
            if (objA == mn) {
                return mn;
            }
            c5803oo1 = this;
            tb0 = tb1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tb0 = c5383mo1.i;
            c5803oo1 = c5383mo1.h;
            C1795Pt1.b(objA);
        }
        AbstractC7926yw0 abstractC7926yw0 = (AbstractC7926yw0) objA;
        c5803oo1.a(abstractC7926yw0.a(), tb0);
        return abstractC7926yw0;
    }

    @Override // TB0.a
    @NotNull
    public final C7716xw0 d() {
        return this.d;
    }
}
