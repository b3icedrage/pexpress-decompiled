package io.sentry.android.core.internal.threaddump;

import defpackage.C2629a1;
import defpackage.C2688aH1;
import defpackage.C6740tH1;
import defpackage.NG1;
import defpackage.OG1;
import io.sentry.android.core.internal.util.l;
import io.sentry.protocol.A;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.util.C4529c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final Pattern f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    public static final Pattern i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern p = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern q = Pattern.compile("\\s+");

    @NotNull
    public final C2688aH1 a;
    public final boolean b;

    @NotNull
    public final C6740tH1 c;

    @NotNull
    public final HashMap d = new HashMap();

    @NotNull
    public final ArrayList e = new ArrayList();

    public c(@NotNull C2688aH1 c2688aH1, boolean z) {
        this.a = c2688aH1;
        this.b = z;
        this.c = new C6740tH1(c2688aH1);
    }

    public static void a(@NotNull A a, @NotNull OG1 og1) {
        Map<String, OG1> map = a.n;
        if (map == null) {
            map = new HashMap<>();
        }
        OG1 og2 = map.get(og1.e);
        if (og2 != null) {
            og2.d = Math.max(og2.d, og1.d);
        } else {
            String str = og1.e;
            OG1 og3 = new OG1();
            og3.d = og1.d;
            og3.e = str;
            og3.g = og1.g;
            og3.h = og1.h;
            og3.i = og1.i;
            og3.j = C4529c.a(og1.j);
            map.put(str, og3);
        }
        a.n = map;
    }

    @Nullable
    public static Long b(@NotNull Matcher matcher, int i2) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(@NotNull Matcher matcher, @NotNull String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:102:0x031d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0323 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0325  */
    /* JADX WARN: Code duplicated, block: B:106:0x0348  */
    /* JADX WARN: Code duplicated, block: B:108:0x034e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0350  */
    /* JADX WARN: Code duplicated, block: B:111:0x037e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0380  */
    /* JADX WARN: Code duplicated, block: B:114:0x0387 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0389  */
    /* JADX WARN: Code duplicated, block: B:118:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x03bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:123:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:125:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:141:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x03e9 A[EDGE_INSN: B:142:0x03e9->B:129:0x03e9 BREAK  A[LOOP:1: B:52:0x016b->B:128:0x03d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x03e9 A[EDGE_INSN: B:143:0x03e9->B:129:0x03e9 BREAK  A[LOOP:1: B:52:0x016b->B:128:0x03d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:54:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0183  */
    /* JADX WARN: Code duplicated, block: B:59:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0200  */
    /* JADX WARN: Code duplicated, block: B:78:0x022a  */
    /* JADX WARN: Code duplicated, block: B:81:0x024c  */
    /* JADX WARN: Code duplicated, block: B:82:0x024f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0255  */
    /* JADX WARN: Code duplicated, block: B:86:0x025d  */
    /* JADX WARN: Code duplicated, block: B:87:0x027b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0286  */
    /* JADX WARN: Code duplicated, block: B:91:0x028f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0297  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:96:0x02cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f3  */
    public final void d(@NotNull b bVar) {
        String str;
        ArrayList arrayList;
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        y yVar;
        a aVarA;
        String str2;
        boolean zC;
        C2688aH1 c2688aH1;
        String str3;
        Matcher matcher11;
        Matcher matcher12;
        y yVar2;
        String strGroup;
        Integer numValueOf;
        String strGroup2;
        String strA;
        HashMap map;
        String strGroup3;
        Integer numValueOf2;
        boolean zEquals;
        boolean z;
        c cVar = this;
        Pattern pattern = f;
        String str4 = "";
        Matcher matcher13 = pattern.matcher("");
        Pattern pattern2 = g;
        Matcher matcher14 = pattern2.matcher("");
        while (true) {
            int i2 = bVar.c;
            int i3 = bVar.b;
            if (i2 >= i3) {
                return;
            }
            a aVarA2 = bVar.a();
            String str5 = "Internal error while parsing thread dump.";
            C2688aH1 c2688aH2 = cVar.a;
            if (aVarA2 == null) {
                c2688aH2.getLogger().a(NG1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str6 = aVarA2.a;
            if (c(matcher13, str6) || c(matcher14, str6)) {
                bVar.c--;
                A a = new A();
                Matcher matcher15 = pattern.matcher(str4);
                Matcher matcher16 = pattern2.matcher(str4);
                if (bVar.c < i3) {
                    a aVarA3 = bVar.a();
                    if (aVarA3 == null) {
                        c2688aH2.getLogger().a(NG1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                    } else {
                        String str7 = aVarA3.a;
                        if (c(matcher15, str7)) {
                            Long lB = b(matcher15, 4);
                            if (lB == null) {
                                c2688aH2.getLogger().a(NG1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                            } else {
                                a.d = lB;
                                a.g = matcher15.group(1);
                                String strGroup4 = matcher15.group(5);
                                if (strGroup4 != null) {
                                    if (strGroup4.contains(" ")) {
                                        a.h = strGroup4.substring(0, strGroup4.indexOf(32));
                                    } else {
                                        a.h = strGroup4;
                                    }
                                }
                                str = a.g;
                                if (str != null) {
                                    zEquals = str.equals("main");
                                    a.l = Boolean.valueOf(zEquals);
                                    a.i = Boolean.valueOf(zEquals);
                                    if (zEquals || cVar.b) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    a.j = Boolean.valueOf(z);
                                }
                                arrayList = new ArrayList();
                                matcher = h.matcher(str4);
                                matcher2 = i.matcher(str4);
                                matcher3 = j.matcher(str4);
                                matcher4 = k.matcher(str4);
                                matcher5 = m.matcher(str4);
                                matcher6 = l.matcher(str4);
                                matcher7 = o.matcher(str4);
                                matcher8 = n.matcher(str4);
                                matcher9 = p.matcher(str4);
                                matcher10 = q.matcher(str4);
                                yVar = null;
                                while (bVar.c < i3) {
                                    aVarA = bVar.a();
                                    if (aVarA == null) {
                                        c2688aH2.getLogger().a(NG1.WARNING, str5, new Object[0]);
                                        break;
                                    }
                                    str2 = aVarA.a;
                                    zC = c(matcher2, str2);
                                    c2688aH1 = cVar.c.a;
                                    int i4 = i3;
                                    if (zC) {
                                        yVar = new y();
                                        str3 = str5;
                                        String strB = C2629a1.b(matcher2.group(1), ".", matcher2.group(2));
                                        yVar.j = strB;
                                        yVar.i = matcher2.group(3);
                                        yVar.h = matcher2.group(4);
                                        strGroup3 = matcher2.group(5);
                                        if (strGroup3 != null || strGroup3.length() == 0) {
                                            numValueOf2 = null;
                                        } else {
                                            int i5 = Integer.parseInt(strGroup3);
                                            numValueOf2 = Integer.valueOf(i5);
                                            if (i5 < 0) {
                                                numValueOf2 = null;
                                            }
                                        }
                                        yVar.k = numValueOf2;
                                        yVar.o = C6740tH1.c(strB, c2688aH1.getInAppIncludes(), c2688aH1.getInAppExcludes());
                                        arrayList.add(yVar);
                                        matcher2 = matcher2;
                                    } else {
                                        str3 = str5;
                                        if (c(matcher, str2)) {
                                            yVar2 = new y();
                                            yVar2.p = matcher.group(3);
                                            yVar2.i = matcher.group(6);
                                            strGroup = matcher.group(7);
                                            if (strGroup != null || strGroup.length() == 0) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
                                            }
                                            yVar2.k = numValueOf;
                                            yVar2.u = "0x" + matcher.group(2);
                                            yVar2.r = "native";
                                            strGroup2 = matcher.group(8);
                                            if (strGroup2 == null) {
                                                strA = null;
                                            } else {
                                                strA = l.a(strGroup2);
                                            }
                                            if (strA != null) {
                                                map = cVar.d;
                                                if (!map.containsKey(strA)) {
                                                    DebugImage debugImage = new DebugImage();
                                                    debugImage.setDebugId(strA);
                                                    debugImage.setType("elf");
                                                    debugImage.setCodeFile(matcher.group(4));
                                                    debugImage.setCodeId(strGroup2);
                                                    map.put(strA, debugImage);
                                                }
                                                yVar2.v = "rel:".concat(strA);
                                            } else {
                                                matcher2 = matcher2;
                                            }
                                            arrayList.add(yVar2);
                                            yVar = null;
                                        } else {
                                            matcher2 = matcher2;
                                            if (c(matcher3, str2)) {
                                                yVar = new y();
                                                String strB2 = C2629a1.b(matcher3.group(1), ".", matcher3.group(2));
                                                yVar.j = strB2;
                                                yVar.i = matcher3.group(3);
                                                yVar.o = C6740tH1.c(strB2, c2688aH1.getInAppIncludes(), c2688aH1.getInAppExcludes());
                                                yVar.q = Boolean.TRUE;
                                                arrayList.add(yVar);
                                            } else if (c(matcher4, str2)) {
                                                if (yVar != null) {
                                                    OG1 og1 = new OG1();
                                                    og1.d = 1;
                                                    og1.e = matcher4.group(1);
                                                    og1.g = matcher4.group(2);
                                                    og1.h = matcher4.group(3);
                                                    yVar.z = og1;
                                                    a(a, og1);
                                                }
                                            } else if (c(matcher5, str2)) {
                                                if (c(matcher6, str2)) {
                                                    if (yVar != null) {
                                                        OG1 og2 = new OG1();
                                                        og2.d = 4;
                                                        og2.e = matcher6.group(1);
                                                        og2.g = matcher6.group(2);
                                                        og2.h = matcher6.group(3);
                                                        yVar.z = og2;
                                                        a(a, og2);
                                                    }
                                                } else if (c(matcher7, str2)) {
                                                    if (yVar != null) {
                                                        OG1 og3 = new OG1();
                                                        og3.d = 8;
                                                        og3.e = matcher7.group(1);
                                                        og3.g = matcher7.group(2);
                                                        og3.h = matcher7.group(3);
                                                        og3.i = b(matcher7, 4);
                                                        yVar.z = og3;
                                                        a(a, og3);
                                                    }
                                                    matcher11 = matcher9;
                                                    matcher12 = matcher10;
                                                } else {
                                                    if (c(matcher8, str2)) {
                                                        matcher11 = matcher9;
                                                        if (c(matcher11, str2)) {
                                                            if (str2.length() != 0) {
                                                                break;
                                                            }
                                                            matcher12 = matcher10;
                                                            if (c(matcher12, str2)) {
                                                                break;
                                                            }
                                                        } else if (yVar != null) {
                                                            OG1 og4 = new OG1();
                                                            og4.d = 8;
                                                            yVar.z = og4;
                                                            a(a, og4);
                                                        }
                                                    } else {
                                                        if (yVar != null) {
                                                            OG1 og5 = new OG1();
                                                            og5.d = 8;
                                                            og5.e = matcher8.group(1);
                                                            og5.g = matcher8.group(2);
                                                            og5.h = matcher8.group(3);
                                                            yVar.z = og5;
                                                            a(a, og5);
                                                        }
                                                        matcher11 = matcher9;
                                                    }
                                                    matcher12 = matcher10;
                                                }
                                                bVar = bVar;
                                                matcher9 = matcher11;
                                                matcher10 = matcher12;
                                                matcher2 = matcher2;
                                                str5 = str3;
                                                i3 = i4;
                                                cVar = this;
                                            } else if (yVar != null) {
                                                OG1 og6 = new OG1();
                                                og6.d = 2;
                                                og6.e = matcher5.group(1);
                                                og6.g = matcher5.group(2);
                                                og6.h = matcher5.group(3);
                                                yVar.z = og6;
                                                a(a, og6);
                                            }
                                        }
                                    }
                                    matcher11 = matcher9;
                                    matcher12 = matcher10;
                                    bVar = bVar;
                                    matcher9 = matcher11;
                                    matcher10 = matcher12;
                                    matcher2 = matcher2;
                                    str5 = str3;
                                    i3 = i4;
                                    cVar = this;
                                }
                                Collections.reverse(arrayList);
                                z zVar = new z(arrayList);
                                zVar.g = Boolean.TRUE;
                                a.m = zVar;
                            }
                        } else {
                            if (c(matcher16, str7)) {
                                Long lB2 = b(matcher16, 3);
                                if (lB2 == null) {
                                    c2688aH2.getLogger().a(NG1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                } else {
                                    a.d = lB2;
                                    a.g = matcher16.group(1);
                                }
                            }
                            str = a.g;
                            if (str != null) {
                                zEquals = str.equals("main");
                                a.l = Boolean.valueOf(zEquals);
                                a.i = Boolean.valueOf(zEquals);
                                if (zEquals) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                a.j = Boolean.valueOf(z);
                            }
                            arrayList = new ArrayList();
                            matcher = h.matcher(str4);
                            matcher2 = i.matcher(str4);
                            matcher3 = j.matcher(str4);
                            matcher4 = k.matcher(str4);
                            matcher5 = m.matcher(str4);
                            matcher6 = l.matcher(str4);
                            matcher7 = o.matcher(str4);
                            matcher8 = n.matcher(str4);
                            matcher9 = p.matcher(str4);
                            matcher10 = q.matcher(str4);
                            yVar = null;
                            while (bVar.c < i3) {
                                aVarA = bVar.a();
                                if (aVarA == null) {
                                    c2688aH2.getLogger().a(NG1.WARNING, str5, new Object[0]);
                                    break;
                                }
                                str2 = aVarA.a;
                                zC = c(matcher2, str2);
                                c2688aH1 = cVar.c.a;
                                int i6 = i3;
                                if (zC) {
                                    yVar = new y();
                                    str3 = str5;
                                    String strB3 = C2629a1.b(matcher2.group(1), ".", matcher2.group(2));
                                    yVar.j = strB3;
                                    yVar.i = matcher2.group(3);
                                    yVar.h = matcher2.group(4);
                                    strGroup3 = matcher2.group(5);
                                    if (strGroup3 != null) {
                                        numValueOf2 = null;
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    yVar.k = numValueOf2;
                                    yVar.o = C6740tH1.c(strB3, c2688aH1.getInAppIncludes(), c2688aH1.getInAppExcludes());
                                    arrayList.add(yVar);
                                    matcher2 = matcher2;
                                } else {
                                    str3 = str5;
                                    if (c(matcher, str2)) {
                                        yVar2 = new y();
                                        yVar2.p = matcher.group(3);
                                        yVar2.i = matcher.group(6);
                                        strGroup = matcher.group(7);
                                        if (strGroup != null) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                        yVar2.k = numValueOf;
                                        yVar2.u = "0x" + matcher.group(2);
                                        yVar2.r = "native";
                                        strGroup2 = matcher.group(8);
                                        if (strGroup2 == null) {
                                            strA = null;
                                        } else {
                                            strA = l.a(strGroup2);
                                        }
                                        if (strA != null) {
                                            map = cVar.d;
                                            if (!map.containsKey(strA)) {
                                                DebugImage debugImage2 = new DebugImage();
                                                debugImage2.setDebugId(strA);
                                                debugImage2.setType("elf");
                                                debugImage2.setCodeFile(matcher.group(4));
                                                debugImage2.setCodeId(strGroup2);
                                                map.put(strA, debugImage2);
                                            }
                                            yVar2.v = "rel:".concat(strA);
                                        } else {
                                            matcher2 = matcher2;
                                        }
                                        arrayList.add(yVar2);
                                        yVar = null;
                                    } else {
                                        matcher2 = matcher2;
                                        if (c(matcher3, str2)) {
                                            yVar = new y();
                                            String strB4 = C2629a1.b(matcher3.group(1), ".", matcher3.group(2));
                                            yVar.j = strB4;
                                            yVar.i = matcher3.group(3);
                                            yVar.o = C6740tH1.c(strB4, c2688aH1.getInAppIncludes(), c2688aH1.getInAppExcludes());
                                            yVar.q = Boolean.TRUE;
                                            arrayList.add(yVar);
                                        } else if (c(matcher4, str2)) {
                                            if (yVar != null) {
                                                OG1 og7 = new OG1();
                                                og7.d = 1;
                                                og7.e = matcher4.group(1);
                                                og7.g = matcher4.group(2);
                                                og7.h = matcher4.group(3);
                                                yVar.z = og7;
                                                a(a, og7);
                                            }
                                        } else if (c(matcher5, str2)) {
                                            if (c(matcher6, str2)) {
                                                if (yVar != null) {
                                                    OG1 og8 = new OG1();
                                                    og8.d = 4;
                                                    og8.e = matcher6.group(1);
                                                    og8.g = matcher6.group(2);
                                                    og8.h = matcher6.group(3);
                                                    yVar.z = og8;
                                                    a(a, og8);
                                                }
                                            } else if (c(matcher7, str2)) {
                                                if (yVar != null) {
                                                    OG1 og9 = new OG1();
                                                    og9.d = 8;
                                                    og9.e = matcher7.group(1);
                                                    og9.g = matcher7.group(2);
                                                    og9.h = matcher7.group(3);
                                                    og9.i = b(matcher7, 4);
                                                    yVar.z = og9;
                                                    a(a, og9);
                                                }
                                                matcher11 = matcher9;
                                                matcher12 = matcher10;
                                            } else {
                                                if (c(matcher8, str2)) {
                                                    matcher11 = matcher9;
                                                    if (c(matcher11, str2)) {
                                                        if (str2.length() != 0) {
                                                            break;
                                                            break;
                                                        }
                                                        matcher12 = matcher10;
                                                        if (c(matcher12, str2)) {
                                                            break;
                                                            break;
                                                        }
                                                    } else if (yVar != null) {
                                                        OG1 og10 = new OG1();
                                                        og10.d = 8;
                                                        yVar.z = og10;
                                                        a(a, og10);
                                                    }
                                                } else {
                                                    if (yVar != null) {
                                                        OG1 og11 = new OG1();
                                                        og11.d = 8;
                                                        og11.e = matcher8.group(1);
                                                        og11.g = matcher8.group(2);
                                                        og11.h = matcher8.group(3);
                                                        yVar.z = og11;
                                                        a(a, og11);
                                                    }
                                                    matcher11 = matcher9;
                                                }
                                                matcher12 = matcher10;
                                            }
                                            bVar = bVar;
                                            matcher9 = matcher11;
                                            matcher10 = matcher12;
                                            matcher2 = matcher2;
                                            str5 = str3;
                                            i3 = i6;
                                            cVar = this;
                                        } else if (yVar != null) {
                                            OG1 og12 = new OG1();
                                            og12.d = 2;
                                            og12.e = matcher5.group(1);
                                            og12.g = matcher5.group(2);
                                            og12.h = matcher5.group(3);
                                            yVar.z = og12;
                                            a(a, og12);
                                        }
                                    }
                                }
                                matcher11 = matcher9;
                                matcher12 = matcher10;
                                bVar = bVar;
                                matcher9 = matcher11;
                                matcher10 = matcher12;
                                matcher2 = matcher2;
                                str5 = str3;
                                i3 = i6;
                                cVar = this;
                            }
                            Collections.reverse(arrayList);
                            z zVar2 = new z(arrayList);
                            zVar2.g = Boolean.TRUE;
                            a.m = zVar2;
                        }
                    }
                    a = null;
                } else {
                    a = null;
                }
                cVar = this;
                if (a != null) {
                    cVar.e.add(a);
                }
            } else {
                pattern = pattern;
                str4 = str4;
                matcher13 = matcher13;
                pattern2 = pattern2;
                matcher14 = matcher14;
            }
            pattern = pattern;
            matcher13 = matcher13;
            pattern2 = pattern2;
            matcher14 = matcher14;
            str4 = str4;
        }
    }
}
