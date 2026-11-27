package defpackage;

import defpackage.InterfaceC2928bN;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2849b0<T, U extends InterfaceC2928bN<U>> implements KT<T> {
    @NotNull
    public abstract C6457rx<U> a();

    @NotNull
    public abstract U b();

    public abstract T c(@NotNull U u);

    @Override // defpackage.KT
    public final Object parse(@NotNull String input) {
        String str;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            C7436wc1<U> commands = a().c;
            Intrinsics.checkNotNullParameter(commands, "commands");
            try {
                return c(C6385rc1.a(commands, input, b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) input) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) input) + "')";
                }
                throw new NT(str, e);
            }
        } catch (C4445ic1 e2) {
            throw new NT("Failed to parse value from '" + ((Object) input) + '\'', e2);
        }
    }
}
