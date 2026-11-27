package defpackage;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC7645xc0 implements InterfaceC7855yc0 {
    public static final a d;
    public static final /* synthetic */ EnumC7645xc0[] e;

    /* JADX INFO: renamed from: xc0$a */
    public final enum a extends EnumC7645xc0 {
        public a() {
            super("IDENTITY", 0);
        }

        @Override // defpackage.InterfaceC7855yc0
        public final String b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a();
        d = aVar;
        e = new EnumC7645xc0[]{aVar, new EnumC7645xc0() { // from class: xc0.b
            @Override // defpackage.InterfaceC7855yc0
            public final String b(Field field) {
                return EnumC7645xc0.f(field.getName());
            }
        }, new EnumC7645xc0() { // from class: xc0.c
            @Override // defpackage.InterfaceC7855yc0
            public final String b(Field field) {
                return EnumC7645xc0.f(EnumC7645xc0.e(field.getName(), ' '));
            }
        }, new EnumC7645xc0() { // from class: xc0.d
            @Override // defpackage.InterfaceC7855yc0
            public final String b(Field field) {
                return EnumC7645xc0.e(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC7645xc0() { // from class: xc0.e
            @Override // defpackage.InterfaceC7855yc0
            public final String b(Field field) {
                return EnumC7645xc0.e(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC7645xc0() { // from class: xc0.f
            @Override // defpackage.InterfaceC7855yc0
            public final String b(Field field) {
                return EnumC7645xc0.e(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC7645xc0() { // from class: xc0.g
            @Override // defpackage.InterfaceC7855yc0
            public final String b(Field field) {
                return EnumC7645xc0.e(field.getName(), JwtParser.SEPARATOR_CHAR).toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public EnumC7645xc0() {
        throw null;
    }

    public static String e(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String f(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static EnumC7645xc0 valueOf(String str) {
        return (EnumC7645xc0) Enum.valueOf(EnumC7645xc0.class, str);
    }

    public static EnumC7645xc0[] values() {
        return (EnumC7645xc0[]) e.clone();
    }
}
