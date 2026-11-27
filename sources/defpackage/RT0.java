package defpackage;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface RT0 {

    public static final class a implements InterfaceC7031ug1<Long> {

        @NotNull
        public final AbstractC0662Bg1.a<Long> a = C1052Gg1.c("LOSS_LIMIT_DEMO_VALUE");

        @Override // defpackage.InterfaceC7031ug1
        @NotNull
        public final AbstractC0662Bg1.a<Long> getKey() {
            return this.a;
        }
    }

    public static final class b implements InterfaceC7031ug1<Boolean> {

        @NotNull
        public final AbstractC0662Bg1.a<Boolean> a = C1052Gg1.a("LOSS_LIMIT_SELECTED");

        @Override // defpackage.InterfaceC7031ug1
        @NotNull
        public final AbstractC0662Bg1.a<Boolean> getKey() {
            return this.a;
        }
    }

    public static final class c implements InterfaceC7031ug1<Long> {

        @NotNull
        public final AbstractC0662Bg1.a<Long> a = C1052Gg1.c("LOSS_LIMIT_REAL_VALUE");

        @Override // defpackage.InterfaceC7031ug1
        @NotNull
        public final AbstractC0662Bg1.a<Long> getKey() {
            return this.a;
        }
    }

    @NotNull
    InterfaceC6396rf0<Long> a();

    @NotNull
    InterfaceC6396rf0<Long> b();

    @Nullable
    Object c(@NotNull C7530x3 c7530x3, @NotNull C7921yu1 c7921yu1);

    @Nullable
    Object d(@NotNull Function0 function0, @NotNull AW1 aw1);

    @Nullable
    Object e(@NotNull X5 x5, @NotNull C7921yu1 c7921yu1);

    @NotNull
    InterfaceC6396rf0<Boolean> isEnabled();
}
