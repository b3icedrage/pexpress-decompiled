package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5103lW1 extends AbstractC4425iW1 {

    @NotNull
    public final ZL0 d;

    @NotNull
    public final AbstractC0662Bg1.a<Boolean> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5103lW1(@NotNull InterfaceC1442Lg1 preferencesRepository, @NotNull ZL0 languageUseCaseApi) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(languageUseCaseApi, "languageUseCaseApi");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = languageUseCaseApi;
        this.e = C1052Gg1.a("SUPPORT_TEST_WAS_REQUESTED_VALUE");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Boolean> getKey() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC4425iW1
    @Nullable
    public final Object m(@NotNull LM lm) {
        C4683jW1 c4683jW1;
        C5103lW1 c5103lW1;
        Boolean boolValueOf;
        C5103lW1 c5103lW2;
        boolean z;
        Boolean bool;
        if (lm instanceof C4683jW1) {
            c4683jW1 = (C4683jW1) lm;
            int i = c4683jW1.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4683jW1.j = i - Integer.MIN_VALUE;
            } else {
                c4683jW1 = new C4683jW1(this, lm);
            }
        } else {
            c4683jW1 = new C4683jW1(this, lm);
        }
        Object objO = c4683jW1.h;
        MN mn = MN.d;
        int i2 = c4683jW1.j;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<String> interfaceC6396rf0L = this.d.l();
            c4683jW1.d = this;
            c4683jW1.j = 1;
            objO = C4466ii.o(interfaceC6396rf0L, c4683jW1);
            if (objO != mn) {
                c5103lW1 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            c5103lW1 = (C5103lW1) c4683jW1.d;
            C1795Pt1.b(objO);
        } else {
            if (i2 == 2) {
                z = c4683jW1.g;
                boolValueOf = (Boolean) c4683jW1.e;
                c5103lW2 = (C5103lW1) c4683jW1.d;
                C1795Pt1.b(objO);
                InterfaceC6396rf0<String> interfaceC6396rf0L2 = c5103lW2.d.l();
                c4683jW1.d = boolValueOf;
                c4683jW1.e = "AB_EXPERIMENT";
                c4683jW1.g = z;
                c4683jW1.j = 3;
                objO = C4466ii.o(interfaceC6396rf0L2, c4683jW1);
                if (objO != mn) {
                    bool = boolValueOf;
                }
                return mn;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bool = (Boolean) c4683jW1.d;
            C1795Pt1.b(objO);
        }
        Objects.toString(objO);
        return bool;
        boolean zO = d.o((String) objO, "en", false);
        boolValueOf = Boolean.valueOf(zO);
        C4893kW1 c4893kW1 = new C4893kW1(zO, null);
        c4683jW1.d = c5103lW1;
        c4683jW1.e = boolValueOf;
        c4683jW1.g = zO;
        c4683jW1.j = 2;
        if (c5103lW1.l(c4893kW1, c4683jW1) != mn) {
            c5103lW2 = c5103lW1;
            z = zO;
            InterfaceC6396rf0<String> interfaceC6396rf0L3 = c5103lW2.d.l();
            c4683jW1.d = boolValueOf;
            c4683jW1.e = "AB_EXPERIMENT";
            c4683jW1.g = z;
            c4683jW1.j = 3;
            objO = C4466ii.o(interfaceC6396rf0L3, c4683jW1);
            if (objO != mn) {
                bool = boolValueOf;
                Objects.toString(objO);
                return bool;
            }
        }
        return mn;
    }
}
