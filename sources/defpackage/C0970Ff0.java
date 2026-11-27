package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ff0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0970Ff0 {

    @NotNull
    public static final b a = b.d;

    @NotNull
    public static final a b = a.d;

    /* JADX INFO: renamed from: Ff0$a */
    public static final class a extends ML0 implements Function2<Object, Object, Boolean> {
        public static final a d = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.a(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: Ff0$b */
    public static final class b extends ML0 implements Function1<Object, Object> {
        public static final b d = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Object obj) {
            return obj;
        }
    }
}
