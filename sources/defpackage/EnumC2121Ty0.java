package defpackage;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ty0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2121Ty0 {

    @NotNull
    public static final a d;

    @NotNull
    public static final ArrayList e;
    public static final EnumC2121Ty0 g;
    public static final EnumC2121Ty0 h;
    public static final EnumC2121Ty0 i;
    public static final EnumC2121Ty0 j;
    public static final /* synthetic */ EnumC2121Ty0[] k;

    /* JADX INFO: renamed from: Ty0$a */
    public static final class a {
    }

    static {
        EnumC2121Ty0 enumC2121Ty0 = new EnumC2121Ty0("POPULAR", 0);
        g = enumC2121Ty0;
        EnumC2121Ty0 enumC2121Ty1 = new EnumC2121Ty0("OSCILLATOR", 1);
        h = enumC2121Ty1;
        EnumC2121Ty0 enumC2121Ty2 = new EnumC2121Ty0("TREND", 2);
        i = enumC2121Ty2;
        EnumC2121Ty0 enumC2121Ty3 = new EnumC2121Ty0("COMBINATION", 3);
        j = enumC2121Ty3;
        EnumC2121Ty0[] enumC2121Ty0Arr = {enumC2121Ty0, enumC2121Ty1, enumC2121Ty2, enumC2121Ty3};
        k = enumC2121Ty0Arr;
        C1952Ru.i(enumC2121Ty0Arr);
        d = new a();
        EnumC2121Ty0[] enumC2121Ty0ArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC2121Ty0 enumC2121Ty4 : enumC2121Ty0ArrValues) {
            if (enumC2121Ty4 != j) {
                arrayList.add(enumC2121Ty4);
            }
        }
        e = arrayList;
    }

    public EnumC2121Ty0() {
        throw null;
    }

    public static EnumC2121Ty0 valueOf(String str) {
        return (EnumC2121Ty0) Enum.valueOf(EnumC2121Ty0.class, str);
    }

    public static EnumC2121Ty0[] values() {
        return (EnumC2121Ty0[]) k.clone();
    }
}
