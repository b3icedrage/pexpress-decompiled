package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class MZ0 {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            AbstractC1646Nw.e eVar = AbstractC1646Nw.e;
            sb.append(C7652xe.c(new AbstractC1646Nw.e(((String) obj).getBytes(XB0.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1646Nw) {
            sb.append(": \"");
            sb.append(C7652xe.c((AbstractC1646Nw) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0595Ak0) {
            sb.append(" {");
            c((AbstractC0595Ak0) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01af  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b1  */
    public static void c(AbstractC0595Ak0 abstractC0595Ak0, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : abstractC0595Ak0.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String str2 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, a(str2), AbstractC0595Ak0.s(method2, abstractC0595Ak0, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String str3 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, a(str3), AbstractC0595Ak0.s(method3, abstractC0595Ak0, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    if (map.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                    }
                }
                String str4 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objS = AbstractC0595Ak0.s(method4, abstractC0595Ak0, new Object[0]);
                    if (method5 == null) {
                        if (objS instanceof Boolean) {
                            zEquals = !((Boolean) objS).booleanValue();
                        } else if (objS instanceof Integer) {
                            if (((Integer) objS).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objS instanceof Float) {
                            if (((Float) objS).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objS instanceof Double) {
                            if (((Double) objS).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objS instanceof String) {
                            zEquals = objS.equals("");
                        } else if (objS instanceof AbstractC1646Nw) {
                            zEquals = objS.equals(AbstractC1646Nw.e);
                        } else if (!(objS instanceof GZ0) ? !((objS instanceof Enum) && ((Enum) objS).ordinal() == 0) : objS != ((GZ0) objS).d()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC0595Ak0.s(method5, abstractC0595Ak0, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        b(sb, i, a(str4), objS);
                    }
                }
            }
        }
        if (abstractC0595Ak0 instanceof AbstractC0595Ak0.c) {
            Iterator<Map.Entry<T, Object>> itG = ((AbstractC0595Ak0.c) abstractC0595Ak0).extensions.g();
            while (itG.hasNext()) {
                Map.Entry entry = (Map.Entry) itG.next();
                ((AbstractC0595Ak0.d) entry.getKey()).getClass();
                b(sb, i, "[0]", entry.getValue());
            }
        }
        O82 o82 = abstractC0595Ak0.unknownFields;
        if (o82 != null) {
            for (int i2 = 0; i2 < o82.a; i2++) {
                b(sb, i, String.valueOf(o82.b[i2] >>> 3), o82.c[i2]);
            }
        }
    }
}
