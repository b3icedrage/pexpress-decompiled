package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S70 extends CK<Unit> {

    public static final class a extends S70 {

        @NotNull
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String message) {
            super(Unit.a);
            Intrinsics.checkNotNullParameter(message, "message");
            this.b = message;
        }

        @Override // defpackage.CK
        public final AbstractC4649jL0 a(S01 module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return R70.c(Q70.ERROR_CONSTANT_VALUE, this.b);
        }

        @Override // defpackage.CK
        @NotNull
        public final String toString() {
            return this.b;
        }
    }

    @Override // defpackage.CK
    public final Unit b() {
        throw new UnsupportedOperationException();
    }
}
