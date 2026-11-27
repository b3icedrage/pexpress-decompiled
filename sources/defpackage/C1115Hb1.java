package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Hb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1115Hb1<K, V> extends AbstractC6958uK0<K, V, Pair<? extends K, ? extends V>> {

    @NotNull
    public final OH1 c;

    /* JADX INFO: renamed from: Hb1$a */
    public static final class a extends ML0 implements Function1<YC, Unit> {
        public final /* synthetic */ RJ0<K> d;
        public final /* synthetic */ RJ0<V> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RJ0<K> rj0, RJ0<V> rj1) {
            super(1);
            this.d = rj0;
            this.e = rj1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(YC yc) {
            YC buildClassSerialDescriptor = yc;
            Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            YC.a(buildClassSerialDescriptor, "first", this.d.c());
            YC.a(buildClassSerialDescriptor, "second", this.e.c());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115Hb1(@NotNull RJ0<K> keySerializer, @NotNull RJ0<V> valueSerializer) {
        super(keySerializer, valueSerializer);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.c = SH1.b("kotlin.Pair", new MH1[0], new a(keySerializer, valueSerializer));
    }

    @Override // defpackage.RJ0
    @NotNull
    public final MH1 c() {
        return this.c;
    }

    @Override // defpackage.AbstractC6958uK0
    public final Object e(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.d;
    }

    @Override // defpackage.AbstractC6958uK0
    public final Object f(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return pair.e;
    }

    @Override // defpackage.AbstractC6958uK0
    public final Object g(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }
}
