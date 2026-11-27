package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5267mG0 implements InterfaceC5091lS1 {

    @NotNull
    public static final a d = new a(new C7577xG0(false, false, false, false, true, "    ", "type", false, true, LC.e), C4383iI1.a);

    @NotNull
    public final C7577xG0 a;

    @NotNull
    public final WH1 b;

    @NotNull
    public final C4222hZ c = new C4222hZ();

    /* JADX INFO: renamed from: mG0$a */
    public static final class a extends AbstractC5267mG0 {
    }

    public AbstractC5267mG0(C7577xG0 c7577xG0, WH1 wh1) {
        this.a = c7577xG0;
        this.b = wh1;
    }

    @Override // defpackage.UH1
    @NotNull
    public final G1 a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC5091lS1
    @NotNull
    public final String b(@NotNull RJ0 serializer, Object obj) {
        char[] cArr;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        IH0 ih0 = new IH0();
        C4615jA c4615jA = C4615jA.c;
        synchronized (c4615jA) {
            C6202qj<char[]> c6202qj = c4615jA.a;
            cArr = null;
            char[] cArrRemoveLast = c6202qj.isEmpty() ? null : c6202qj.removeLast();
            if (cArrRemoveLast != null) {
                c4615jA.b -= cArrRemoveLast.length;
                cArr = cArrRemoveLast;
            }
        }
        if (cArr == null) {
            cArr = new char[UserVerificationMethods.USER_VERIFY_PATTERN];
        }
        ih0.a = cArr;
        try {
            FH0.a(this, ih0, serializer, obj);
            return ih0.toString();
        } finally {
            ih0.b();
        }
    }

    @Override // defpackage.InterfaceC5091lS1
    public final Object c(@NotNull RJ0 deserializer, @NotNull String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        C5304mS1 c5304mS1 = new C5304mS1(string);
        Object objD = new C3573eS1(this, EnumC3852fl2.OBJ, c5304mS1, deserializer.c(), null).d(deserializer);
        c5304mS1.p();
        return objD;
    }
}
