package defpackage;

import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: renamed from: w51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7329w51 {
    public final C3315dC0 a;
    public final InterfaceC7884yj1 b;

    public C7329w51(C6699t51 c6699t51, C3315dC0 c3315dC0, InterfaceC7884yj1 interfaceC7884yj1) {
        this.a = c3315dC0;
        this.b = interfaceC7884yj1;
    }

    public static C6699t51 b(String str) {
        C4320i02.a aVar = C4320i02.a.d;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C4320i02.a aVar2 = aVar;
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            i++;
            int iOrdinal = aVar2.ordinal();
            C4320i02.a aVar3 = C4320i02.a.e;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        if (cCharAt == '$') {
                            sb.append(':');
                            C4320i02.a(arrayList, sb);
                            sb.setLength(0);
                            aVar2 = aVar3;
                        } else if (cCharAt != '-') {
                            sb.append(':');
                            sb.append(cCharAt);
                        } else {
                            arrayList.add(C3271d02.f);
                        }
                    }
                } else if (cCharAt == '{') {
                    arrayList.add(C3271d02.c);
                } else {
                    sb.append('$');
                    sb.append(cCharAt);
                }
                aVar2 = aVar;
            } else if (cCharAt == '$') {
                C4320i02.a(arrayList, sb);
                sb.setLength(0);
                aVar2 = aVar3;
            } else if (cCharAt == ':') {
                C4320i02.a(arrayList, sb);
                sb.setLength(0);
                aVar2 = C4320i02.a.g;
            } else if (cCharAt == '{') {
                C4320i02.a(arrayList, sb);
                arrayList.add(C3271d02.d);
                sb.setLength(0);
            } else if (cCharAt == '}') {
                C4320i02.a(arrayList, sb);
                arrayList.add(C3271d02.e);
                sb.setLength(0);
            } else {
                sb.append(cCharAt);
            }
        }
        int iOrdinal2 = aVar2.ordinal();
        if (iOrdinal2 == 0) {
            C4320i02.a(arrayList, sb);
        } else if (iOrdinal2 == 1) {
            sb.append('$');
            C4320i02.a(arrayList, sb);
        } else if (iOrdinal2 == 2) {
            sb.append(':');
            C4320i02.a(arrayList, sb);
        }
        C5756oc1 c5756oc1 = new C5756oc1(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return c5756oc1.a();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ba A[PHI: r2
      0x00ba: PHI (r2v8 java.lang.String) = (r2v4 java.lang.String), (r2v6 java.lang.String) binds: [B:43:0x00b8, B:48:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(C6699t51 c6699t51, StringBuilder sb, Stack<C6699t51> stack) {
        InterfaceC7884yj1 interfaceC7884yj1;
        String property;
        while (c6699t51 != null) {
            C6699t51.a aVar = c6699t51.a;
            int iOrdinal = aVar.ordinal();
            Object obj = c6699t51.b;
            if (iOrdinal == 0) {
                sb.append((String) obj);
            } else if (iOrdinal != 1) {
                continue;
            } else {
                for (C6699t51 c6699t52 : stack) {
                    if (aVar.equals(c6699t52.a) && (obj == null || obj.equals(c6699t52.b))) {
                        C6699t51 c6699t53 = c6699t51.c;
                        if (c6699t53 == null || c6699t53.equals(c6699t52.c)) {
                            stack.push(c6699t51);
                            StringBuilder sb2 = new StringBuilder("Circular variable reference detected while parsing input [");
                            for (C6699t51 c6699t54 : stack) {
                                sb2.append("${");
                                sb2.append((String) ((C6699t51) c6699t54.b).b);
                                sb2.append("}");
                                if (stack.lastElement() != c6699t54) {
                                    sb2.append(" --> ");
                                }
                            }
                            sb2.append("]");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
                stack.push(c6699t51);
                StringBuilder sb3 = new StringBuilder();
                a((C6699t51) obj, sb3, stack);
                String string = sb3.toString();
                String strA = this.a.a(string);
                if (strA == null && ((interfaceC7884yj1 = this.b) == null || (strA = interfaceC7884yj1.a(string)) == null)) {
                    strA = null;
                    try {
                        property = System.getProperty(string, null);
                    } catch (SecurityException unused) {
                        property = null;
                    }
                    if (property != null) {
                        strA = property;
                    } else {
                        try {
                            property = System.getenv(string);
                        } catch (SecurityException unused2) {
                            property = null;
                        }
                        if (property != null) {
                            strA = property;
                        }
                    }
                }
                if (strA != null) {
                    a(b(strA), sb, stack);
                    stack.pop();
                } else {
                    C6699t51 c6699t55 = c6699t51.c;
                    if (c6699t55 == null) {
                        sb.append(string + "_IS_UNDEFINED");
                        stack.pop();
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        a(c6699t55, sb4, stack);
                        stack.pop();
                        sb.append(sb4.toString());
                    }
                }
            }
            c6699t51 = c6699t51.d;
        }
    }
}
