package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ui1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2152Ui1 {

    /* JADX INFO: renamed from: Ui1$a */
    public static final class a implements InterfaceC7031ug1<Long> {

        @NotNull
        public final AbstractC0662Bg1.a<Long> a = C1052Gg1.c("trading_options_maximum_demo_balance_value");

        @Override // defpackage.InterfaceC7031ug1
        @NotNull
        public final AbstractC0662Bg1.a<Long> getKey() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: Ui1$b */
    public static final class b implements InterfaceC7031ug1<Boolean> {

        @NotNull
        public final AbstractC0662Bg1.a<Boolean> a = C1052Gg1.a("trading_options_maximum_balance_selected");

        @Override // defpackage.InterfaceC7031ug1
        @NotNull
        public final AbstractC0662Bg1.a<Boolean> getKey() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: Ui1$c */
    public static final class c implements InterfaceC7031ug1<Long> {

        @NotNull
        public final AbstractC0662Bg1.a<Long> a = C1052Gg1.c("trading_options_maximum_real_balance_value");

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
    Object c(@NotNull C5710oO c5710oO, @NotNull C3475dz1 c3475dz1);

    @Nullable
    Object d(@NotNull C5710oO c5710oO, @NotNull C3475dz1 c3475dz1);

    @Nullable
    Object e(@NotNull C2542Yy1 c2542Yy1, @NotNull C3056bz1 c3056bz1);

    @NotNull
    C6610sg0 isEnabled();
}
