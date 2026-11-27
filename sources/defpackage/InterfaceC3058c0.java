package defpackage;

import defpackage.InterfaceC3058c0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3058c0<Target, ActualSelf extends InterfaceC3058c0<Target, ActualSelf>> extends LT {

    /* JADX INFO: renamed from: c0$a */
    public static final class a {
        public static <Target, ActualSelf extends InterfaceC3058c0<Target, ActualSelf>> void a(@NotNull InterfaceC3058c0<Target, ActualSelf> interfaceC3058c0, @NotNull Function1<? super ActualSelf, Unit>[] otherFormats, @NotNull Function1<? super ActualSelf, Unit> mainFormat) {
            Intrinsics.checkNotNullParameter(otherFormats, "otherFormats");
            Intrinsics.checkNotNullParameter(mainFormat, "mainFormat");
            ArrayList arrayList = new ArrayList(otherFormats.length);
            for (Function1<? super ActualSelf, Unit> function1 : otherFormats) {
                InterfaceC3058c0 interfaceC3058c0S = interfaceC3058c0.s();
                function1.invoke(interfaceC3058c0S);
                arrayList.add(new PH(interfaceC3058c0S.a().a));
            }
            InterfaceC3058c0 interfaceC3058c0S2 = interfaceC3058c0.s();
            mainFormat.invoke(interfaceC3058c0S2);
            interfaceC3058c0.a().a(new P9(new PH(interfaceC3058c0S2.a().a), arrayList));
        }

        public static <Target, ActualSelf extends InterfaceC3058c0<Target, ActualSelf>> void b(@NotNull InterfaceC3058c0<Target, ActualSelf> interfaceC3058c0, @NotNull String onZero, @NotNull Function1<? super ActualSelf, Unit> format) {
            Intrinsics.checkNotNullParameter(onZero, "onZero");
            Intrinsics.checkNotNullParameter(format, "format");
            C7458wi<Target> c7458wiA = interfaceC3058c0.a();
            InterfaceC3058c0 interfaceC3058c0S = interfaceC3058c0.s();
            format.invoke(interfaceC3058c0S);
            Unit unit = Unit.a;
            c7458wiA.a(new C3388da1(onZero, new PH(interfaceC3058c0S.a().a)));
        }

        @NotNull
        public static <Target, ActualSelf extends InterfaceC3058c0<Target, ActualSelf>> C6457rx<Target> c(@NotNull InterfaceC3058c0<Target, ActualSelf> interfaceC3058c0) {
            ArrayList formats = interfaceC3058c0.a().a;
            Intrinsics.checkNotNullParameter(formats, "formats");
            return new C6457rx<>(formats);
        }

        public static <Target, ActualSelf extends InterfaceC3058c0<Target, ActualSelf>> void d(@NotNull InterfaceC3058c0<Target, ActualSelf> interfaceC3058c0, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            interfaceC3058c0.a().a(new C8008zK(value));
        }
    }

    @NotNull
    C7458wi<Target> a();

    void b(@NotNull String str, @NotNull Function1<? super ActualSelf, Unit> function1);

    void p(@NotNull Function1<? super ActualSelf, Unit>[] function1Arr, @NotNull Function1<? super ActualSelf, Unit> function1);

    @NotNull
    ActualSelf s();
}
