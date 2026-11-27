package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Kr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC1397Kr1 {
    public static final b d;
    public static final a e;
    public static final /* synthetic */ EnumC1397Kr1[] g;

    /* JADX INFO: renamed from: Kr1$a */
    public static final class a extends EnumC1397Kr1 {
        public a() {
            super("HTML", 1);
        }

        @Override // defpackage.EnumC1397Kr1
        @NotNull
        public final String b(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return d.m(d.m(string, "<", "&lt;"), ">", "&gt;");
        }
    }

    /* JADX INFO: renamed from: Kr1$b */
    public static final class b extends EnumC1397Kr1 {
        public b() {
            super("PLAIN", 0);
        }

        @Override // defpackage.EnumC1397Kr1
        @NotNull
        public final String b(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return string;
        }
    }

    static {
        b bVar = new b();
        d = bVar;
        a aVar = new a();
        e = aVar;
        EnumC1397Kr1[] enumC1397Kr1Arr = {bVar, aVar};
        g = enumC1397Kr1Arr;
        C1952Ru.i(enumC1397Kr1Arr);
    }

    public EnumC1397Kr1() {
        throw null;
    }

    public static EnumC1397Kr1 valueOf(String str) {
        return (EnumC1397Kr1) Enum.valueOf(EnumC1397Kr1.class, str);
    }

    public static EnumC1397Kr1[] values() {
        return (EnumC1397Kr1[]) g.clone();
    }

    @NotNull
    public abstract String b(@NotNull String str);
}
