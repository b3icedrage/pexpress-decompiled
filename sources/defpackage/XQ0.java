package defpackage;

import androidx.lifecycle.LiveData;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class XQ0 extends InterfaceC1179Hx.a {

    @NotNull
    public final InterfaceC5889pD1 a;

    @NotNull
    public final C4705jd.a b;

    public XQ0(@NotNull InterfaceC5889pD1 schedulers, @NotNull C4705jd.a responseFactory) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(responseFactory, "responseFactory");
        this.a = schedulers;
        this.b = responseFactory;
    }

    @Override // defpackage.InterfaceC1179Hx.a
    @Nullable
    public final InterfaceC1179Hx<?, ?> a(@NotNull Type returnType, @NotNull Annotation[] annotations, @NotNull C2263Vt1 retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.a(Dc2.f(returnType), LiveData.class)) {
            return null;
        }
        Type typeE = Dc2.e(0, (ParameterizedType) returnType);
        if (!Intrinsics.a(Dc2.f(typeE), C4705jd.class)) {
            throw new IllegalArgumentException("Type must be a Response");
        }
        if (!(typeE instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Response must be parameterized");
        }
        Type typeE2 = Dc2.e(0, (ParameterizedType) typeE);
        Intrinsics.checkNotNullExpressionValue(typeE2, "getParameterUpperBound(0, observableType)");
        return new WQ0(typeE2, this.a, this.b);
    }
}
