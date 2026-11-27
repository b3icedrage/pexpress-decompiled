package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class WH1 extends G1 {

    @NotNull
    public final C5863p60 e;

    @NotNull
    public final C5863p60 f;

    @NotNull
    public final C5863p60 g;

    @NotNull
    public final C5863p60 h;

    @NotNull
    public final C5863p60 i;

    public WH1(@NotNull C5863p60 class2ContextualFactory, @NotNull C5863p60 polyBase2Serializers, @NotNull C5863p60 polyBase2DefaultSerializerProvider, @NotNull C5863p60 polyBase2NamedSerializers, @NotNull C5863p60 polyBase2DefaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.e = class2ContextualFactory;
        this.f = polyBase2Serializers;
        this.g = polyBase2DefaultSerializerProvider;
        this.h = polyBase2NamedSerializers;
        this.i = polyBase2DefaultDeserializerProvider;
    }

    @Override // defpackage.G1
    @Nullable
    public final <T> RJ0<T> f(@NotNull RI0<T> kClass, @NotNull List<? extends RJ0<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.e.getClass();
        return null;
    }

    @Override // defpackage.G1
    @Nullable
    public final <T> RJ0 i(@NotNull RI0<? super T> baseClass, @NotNull T value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.g(value)) {
            return null;
        }
        this.f.getClass();
        this.g.getClass();
        F62.f(1, null);
        return null;
    }

    @Override // defpackage.G1
    @Nullable
    public final <T> RJ0 j(@NotNull RI0<? super T> baseClass, @Nullable String str) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.h.getClass();
        this.i.getClass();
        F62.f(1, null);
        return null;
    }
}
