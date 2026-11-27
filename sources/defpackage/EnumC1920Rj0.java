package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Rj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1920Rj0 {

    @NotNull
    public static final a d;
    public static final /* synthetic */ EnumC1920Rj0[] e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1920Rj0 EF5;

    /* JADX INFO: renamed from: Rj0$a */
    public static final class a {
    }

    static {
        EnumC1920Rj0[] enumC1920Rj0Arr = {new EnumC1920Rj0("Function", 0), new EnumC1920Rj0("SuspendFunction", 1), new EnumC1920Rj0("KFunction", 2), new EnumC1920Rj0("KSuspendFunction", 3), new EnumC1920Rj0("UNKNOWN", 4)};
        e = enumC1920Rj0Arr;
        C1952Ru.i(enumC1920Rj0Arr);
        d = new a();
    }

    public EnumC1920Rj0() {
        throw null;
    }

    public static EnumC1920Rj0 valueOf(String str) {
        return (EnumC1920Rj0) Enum.valueOf(EnumC1920Rj0.class, str);
    }

    public static EnumC1920Rj0[] values() {
        return (EnumC1920Rj0[]) e.clone();
    }
}
