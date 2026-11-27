package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6353rS1 extends ZI1<String> {

    /* JADX INFO: renamed from: rS1$a */
    public static final class a {
        @Nullable
        public static Object a(@NotNull InterfaceC6353rS1 interfaceC6353rS1, @NotNull TA ta, @NotNull JM<? super Unit> jm) {
            Object objC = interfaceC6353rS1.b().c(new YI1(ta, interfaceC6353rS1), jm);
            MN mn = MN.d;
            if (objC != mn) {
                objC = Unit.a;
            }
            return objC == mn ? objC : Unit.a;
        }
    }
}
