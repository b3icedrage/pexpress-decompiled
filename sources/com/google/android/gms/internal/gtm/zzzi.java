package com.google.android.gms.internal.gtm;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1332Jw;
import defpackage.K1;
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
final class zzzi {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzzg zzzgVar, String str) {
        StringBuilder sbB = K1.b("# ", str);
        zzd(zzzgVar, sbB, 0);
        return sbB.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
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
            sb.append(zzaai.zza(new zzua(((String) obj).getBytes(zzye.zzb))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzud) {
            sb.append(": \"");
            sb.append(zzaai.zza((zzud) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzxv) {
            sb.append(" {");
            zzd((zzxv) obj, sb, i + 2);
            sb.append("\n");
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb.append("\n");
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    private static void zzd(zzzg zzzgVar, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzzgVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzxv.zzaj(method2, zzzgVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzxv.zzaj(method, zzzgVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzaj = zzxv.zzaj(method4, zzzgVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzaj instanceof Boolean) {
                            if (((Boolean) objZzaj).booleanValue()) {
                                zzb(sb, i, strSubstring, objZzaj);
                            }
                        } else if (objZzaj instanceof Integer) {
                            if (((Integer) objZzaj).intValue() != 0) {
                                zzb(sb, i, strSubstring, objZzaj);
                            }
                        } else if (objZzaj instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzaj).floatValue()) != 0) {
                                zzb(sb, i, strSubstring, objZzaj);
                            }
                        } else if (!(objZzaj instanceof Double)) {
                            if (objZzaj instanceof String) {
                                zEquals = objZzaj.equals("");
                            } else if (objZzaj instanceof zzud) {
                                zEquals = objZzaj.equals(zzud.zzb);
                            } else if (objZzaj instanceof zzzg) {
                                if (objZzaj != ((zzzg) objZzaj).zzax()) {
                                    zzb(sb, i, strSubstring, objZzaj);
                                }
                            } else if (!(objZzaj instanceof Enum) || ((Enum) objZzaj).ordinal() != 0) {
                                zzb(sb, i, strSubstring, objZzaj);
                            }
                            if (!zEquals) {
                                zzb(sb, i, strSubstring, objZzaj);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzaj).doubleValue()) != 0) {
                            zzb(sb, i, strSubstring, objZzaj);
                        }
                    } else if (((Boolean) zzxv.zzaj(method5, zzzgVar, new Object[0])).booleanValue()) {
                        zzb(sb, i, strSubstring, objZzaj);
                    }
                }
            }
            i2 = 3;
        }
        if (zzzgVar instanceof zzxr) {
            Iterator itZzg = ((zzxr) zzzgVar).zza.zzg();
            while (itZzg.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzg.next();
                zzb(sb, i, C1332Jw.a(((zzxs) entry2.getKey()).zzb, "[", "]"), entry2.getValue());
            }
        }
        zzaal zzaalVar = ((zzxv) zzzgVar).zzc;
        if (zzaalVar != null) {
            zzaalVar.zzi(sb, i);
        }
    }
}
