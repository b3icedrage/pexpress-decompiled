package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class J41 {

    public static final class a extends J41 {

        @NotNull
        public final EnumC6804tc0 a;

        public a(@NotNull EnumC6804tc0 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.a = type;
        }
    }

    public static final class b extends J41 {

        @NotNull
        public final String a;

        public b(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.a = text;
        }
    }
}
