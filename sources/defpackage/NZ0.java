package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class NZ0 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            AbstractC1565Mw.f fVar = AbstractC1565Mw.e;
            sb.append(C3057c.c(new AbstractC1565Mw.f(((String) obj).getBytes(VB0.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1565Mw) {
            sb.append(": \"");
            sb.append(C3057c.c((AbstractC1565Mw) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC8097zk0) {
            sb.append(" {");
            c((AbstractC8097zk0) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        b(sb, i3, "key", entry.getKey());
        b(sb, i3, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:108:0x020d  */
    /* JADX WARN: Code duplicated, block: B:133:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01de  */
    public static void c(AbstractC8097zk0 abstractC8097zk0, StringBuilder sb, int i) {
        int i2;
        int i3;
        Method method;
        Method method2;
        Object objK;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC8097zk0.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method5 = declaredMethods[i4];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method4.getReturnType().equals(List.class)) {
                    b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC8097zk0.k(method4, abstractC8097zk0, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC8097zk0.k(method3, abstractC8097zk0, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objK = AbstractC8097zk0.k(method, abstractC8097zk0, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objK instanceof Boolean) {
                                    zEquals = !((Boolean) objK).booleanValue();
                                } else if (objK instanceof Integer) {
                                    if (((Integer) objK).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objK).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof String) {
                                    zEquals = objK.equals("");
                                } else if (objK instanceof AbstractC1565Mw) {
                                    zEquals = objK.equals(AbstractC1565Mw.e);
                                } else if ((objK instanceof IZ0) ? !((objK instanceof Enum) && ((Enum) objK).ordinal() == 0) : objK != ((IZ0) objK).d()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC8097zk0.k(method2, abstractC8097zk0, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i, strSubstring, objK);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objK = AbstractC8097zk0.k(method, abstractC8097zk0, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objK instanceof Boolean) {
                                zEquals = !((Boolean) objK).booleanValue();
                            } else if (objK instanceof Integer) {
                                if (((Integer) objK).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objK).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof String) {
                                zEquals = objK.equals("");
                            } else if (objK instanceof AbstractC1565Mw) {
                                zEquals = objK.equals(AbstractC1565Mw.e);
                            } else if (objK instanceof IZ0) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC8097zk0.k(method2, abstractC8097zk0, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i, strSubstring, objK);
                        }
                    }
                }
            }
            i2 = i3;
        }
        if (abstractC8097zk0 instanceof AbstractC8097zk0.c) {
            Iterator<Map.Entry<T, Object>> itG = ((AbstractC8097zk0.c) abstractC8097zk0).extensions.g();
            while (itG.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itG.next();
                ((AbstractC8097zk0.d) entry2.getKey()).getClass();
                b(sb, i, "[0]", entry2.getValue());
            }
        }
        P82 p82 = abstractC8097zk0.unknownFields;
        if (p82 != null) {
            for (int i5 = 0; i5 < p82.a; i5++) {
                b(sb, i, String.valueOf(p82.b[i5] >>> 3), p82.c[i5]);
            }
        }
    }
}
