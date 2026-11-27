package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T62 {

    @NotNull
    public static final a a = new a();

    public static final class a extends T62 {
        @Override // defpackage.T62
        public final N62 e(AbstractC4649jL0 key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        public final String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    @NotNull
    public final X62 c() {
        X62 x62E = X62.e(this);
        Intrinsics.checkNotNullExpressionValue(x62E, "create(...)");
        return x62E;
    }

    @NotNull
    public InterfaceC2396Xc d(@NotNull InterfaceC2396Xc annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }

    @Nullable
    public abstract N62 e(@NotNull AbstractC4649jL0 abstractC4649jL0);

    public boolean f() {
        return this instanceof a;
    }

    @NotNull
    public AbstractC4649jL0 g(@NotNull AbstractC4649jL0 topLevelType, @NotNull EnumC3610ed2 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }
}
