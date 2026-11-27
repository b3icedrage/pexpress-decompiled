package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zzge implements Callable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgj zzc;

    public zzge(zzgj zzgjVar, zzaw zzawVar, String str) {
        this.zzc = zzgjVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x031f A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0335 A[LOOP:1: B:102:0x0319->B:107:0x0335, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0362 A[Catch: all -> 0x00a3, LOOP:2: B:110:0x035c->B:112:0x0362, LOOP_END, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0401 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0429 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0461 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x04b4 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x051c A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0532 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x053d A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0541 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x0543 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x055c A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x05a8 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f8 A[Catch: all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0237 A[Catch: all -> 0x00a3, SecurityException -> 0x0255, TryCatch #1 {SecurityException -> 0x0255, blocks: (B:69:0x022f, B:71:0x0237, B:73:0x023d), top: B:159:0x022f, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0262 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0287 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x029f A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ed A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02fa A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:13:0x007c, B:15:0x0088, B:20:0x00a6, B:22:0x00ac, B:25:0x00c7, B:27:0x00de, B:28:0x00e5, B:30:0x00ef, B:31:0x00fc, B:33:0x0106, B:34:0x0113, B:36:0x011e, B:37:0x0126, B:39:0x0142, B:43:0x014f, B:45:0x0164, B:47:0x0174, B:49:0x017c, B:51:0x0182, B:52:0x0185, B:54:0x0194, B:56:0x019a, B:58:0x01ae, B:60:0x01b8, B:61:0x01c9, B:63:0x01cd, B:65:0x01d8, B:68:0x01f8, B:69:0x022f, B:71:0x0237, B:73:0x023d, B:77:0x0258, B:79:0x0262, B:80:0x026f, B:81:0x0281, B:83:0x0287, B:90:0x029f, B:95:0x02ca, B:97:0x02ed, B:99:0x02fa, B:101:0x0306, B:102:0x0319, B:104:0x031f, B:106:0x0331, B:108:0x0337, B:109:0x0355, B:110:0x035c, B:112:0x0362, B:113:0x039a, B:115:0x0401, B:116:0x041b, B:118:0x0429, B:121:0x0474, B:122:0x04ae, B:124:0x04b4, B:126:0x04c7, B:127:0x04d4, B:129:0x051c, B:130:0x052a, B:132:0x0532, B:133:0x0535, B:135:0x053d, B:138:0x0546, B:140:0x055c, B:143:0x056c, B:144:0x056f, B:146:0x05a8, B:147:0x05b1, B:137:0x0543, B:120:0x0461, B:94:0x02a7, B:153:0x060a, B:40:0x0146, B:42:0x014c), top: B:158:0x007c, inners: #1, #2 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        byte[] bArr;
        zzkt zzktVar;
        String strZzt;
        List listZzu;
        Iterator it;
        zzky zzkyVar;
        List list;
        zzkv zzkvVarZzu;
        com.google.android.gms.internal.measurement.zzgm[] zzgmVarArr;
        int i;
        Bundle bundle;
        zzas zzasVarZzn;
        com.google.android.gms.internal.measurement.zzga zzgaVar;
        Bundle bundle2;
        zzh zzhVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        boolean z;
        zzas zzasVarZzc;
        long j;
        zzar zzarVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        com.google.android.gms.internal.measurement.zzfs zzfsVarZze;
        zzat zzatVar;
        long jZzn;
        long jZzp;
        String strZzB;
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze;
        Object objZzf;
        String strZzt2;
        Iterator it2;
        this.zzc.zza.zzA();
        zzic zzicVarZzr = this.zzc.zza.zzr();
        zzaw zzawVar = this.zza;
        String str = this.zzb;
        zzicVarZzr.zzg();
        zzfr.zzO();
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        if (!zzicVarZzr.zzt.zzf().zzs(str, zzdu.zzS)) {
            zzicVarZzr.zzt.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzawVar.zza) && !"_iapx".equals(zzawVar.zza)) {
            zzicVarZzr.zzt.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str, zzawVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzga zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
        zzicVarZzr.zzf.zzi().zzw();
        try {
            zzh zzhVarZzj = zzicVarZzr.zzf.zzi().zzj(str);
            if (zzhVarZzj == null) {
                zzicVarZzr.zzt.zzay().zzc().zzb("Log and bundle not available. package_name", str);
                byte[] bArr2 = new byte[0];
                zzicVarZzr.zzf.zzi().zzx();
                return bArr2;
            }
            if (!zzhVarZzj.zzai()) {
                zzicVarZzr.zzt.zzay().zzc().zzb("Log and bundle disabled. package_name", str);
                byte[] bArr3 = new byte[0];
                zzicVarZzr.zzf.zzi().zzx();
                return bArr3;
            }
            com.google.android.gms.internal.measurement.zzgc zzgcVarZzt = com.google.android.gms.internal.measurement.zzgd.zzt();
            zzgcVarZzt.zzad(1);
            zzgcVarZzt.zzZ("android");
            if (!TextUtils.isEmpty(zzhVarZzj.zzt())) {
                zzgcVarZzt.zzD(zzhVarZzj.zzt());
            }
            if (!TextUtils.isEmpty(zzhVarZzj.zzv())) {
                zzgcVarZzt.zzF((String) Preconditions.checkNotNull(zzhVarZzj.zzv()));
            }
            if (!TextUtils.isEmpty(zzhVarZzj.zzw())) {
                zzgcVarZzt.zzG((String) Preconditions.checkNotNull(zzhVarZzj.zzw()));
            }
            if (zzhVarZzj.zzb() != -2147483648L) {
                zzgcVarZzt.zzH((int) zzhVarZzj.zzb());
            }
            zzgcVarZzt.zzV(zzhVarZzj.zzm());
            zzgcVarZzt.zzP(zzhVarZzj.zzk());
            String strZzy = zzhVarZzj.zzy();
            String strZzr = zzhVarZzj.zzr();
            if (!TextUtils.isEmpty(strZzy)) {
                zzgcVarZzt.zzU(strZzy);
            } else if (!TextUtils.isEmpty(strZzr)) {
                zzgcVarZzt.zzC(strZzr);
            }
            zzai zzaiVarZzh = zzicVarZzr.zzf.zzh(str);
            zzgcVarZzt.zzM(zzhVarZzj.zzj());
            if (zzicVarZzr.zzt.zzJ() && zzicVarZzr.zzt.zzf().zzt(zzgcVarZzt.zzap()) && zzaiVarZzh.zzi(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                zzgcVarZzt.zzO(null);
            }
            zzgcVarZzt.zzL(zzaiVarZzh.zzh());
            if (zzaiVarZzh.zzi(zzah.AD_STORAGE) && zzhVarZzj.zzah()) {
                Pair pairZzd = zzicVarZzr.zzf.zzs().zzd(zzhVarZzj.zzt(), zzaiVarZzh);
                if (!zzhVarZzj.zzah() || TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                    zzicVarZzr.zzt.zzg().zzu();
                    zzgcVarZzt.zzN(Build.MODEL);
                    zzicVarZzr.zzt.zzg().zzu();
                    zzgcVarZzt.zzY(Build.VERSION.RELEASE);
                    zzgcVarZzt.zzaj((int) zzicVarZzr.zzt.zzg().zzb());
                    zzgcVarZzt.zzan(zzicVarZzr.zzt.zzg().zzc());
                    if (zzaiVarZzh.zzi(zzah.ANALYTICS_STORAGE)) {
                        zzgcVarZzt.zzE(zzic.zza((String) Preconditions.checkNotNull(zzhVarZzj.zzu()), Long.toString(zzawVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                        zzgcVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj.zzx()));
                    }
                    strZzt = zzhVarZzj.zzt();
                    listZzu = zzicVarZzr.zzf.zzi().zzu(strZzt);
                    it = listZzu.iterator();
                    do {
                        if (!it.hasNext()) {
                            zzkyVar = null;
                            break;
                        }
                        zzkyVar = (zzky) it.next();
                    } while (!"_lte".equals(zzkyVar.zzc));
                    if (zzkyVar != null) {
                        list = listZzu;
                        zzky zzkyVar2 = new zzky(strZzt, "auto", "_lte", zzicVarZzr.zzt.zzav().currentTimeMillis(), 0L);
                        list.add(zzkyVar2);
                        zzicVarZzr.zzf.zzi().zzL(zzkyVar2);
                    } else {
                        list = listZzu;
                        zzky zzkyVar3 = new zzky(strZzt, "auto", "_lte", zzicVarZzr.zzt.zzav().currentTimeMillis(), 0L);
                        list.add(zzkyVar3);
                        zzicVarZzr.zzf.zzi().zzL(zzkyVar3);
                    }
                    zzkvVarZzu = zzicVarZzr.zzf.zzu();
                    zzkvVarZzu.zzt.zzay().zzj().zza("Checking account type status for ad personalization signals");
                    if (zzkvVarZzu.zzt.zzg().zze()) {
                        strZzt2 = zzhVarZzj.zzt();
                        Preconditions.checkNotNull(strZzt2);
                        if (zzhVarZzj.zzah()) {
                            zzkvVarZzu.zzt.zzay().zzc().zza("Turning off ad personalization due to account type");
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                if ("_npa".equals(((zzky) it2.next()).zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            list.add(new zzky(strZzt2, "auto", "_npa", zzkvVarZzu.zzt.zzav().currentTimeMillis(), 1L));
                        }
                    }
                    zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[list.size()];
                    for (i = 0; i < list.size(); i++) {
                        com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzglVarZzd.zzf(((zzky) list.get(i)).zzc);
                        zzglVarZzd.zzg(((zzky) list.get(i)).zzd);
                        zzicVarZzr.zzf.zzu().zzu(zzglVarZzd, ((zzky) list.get(i)).zze);
                        zzgmVarArr[i] = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaC();
                    }
                    zzgcVarZzt.zzj(Arrays.asList(zzgmVarArr));
                    zzei zzeiVarZzb = zzei.zzb(zzawVar);
                    zzicVarZzr.zzt.zzv().zzL(zzeiVarZzb.zzd, zzicVarZzr.zzf.zzi().zzi(str));
                    zzicVarZzr.zzt.zzv().zzM(zzeiVarZzb, zzicVarZzr.zzt.zzf().zzd(str));
                    bundle = zzeiVarZzb.zzd;
                    bundle.putLong("_c", 1L);
                    zzicVarZzr.zzt.zzay().zzc().zza("Marking in-app purchase as real-time");
                    bundle.putLong("_r", 1L);
                    bundle.putString("_o", zzawVar.zzc);
                    if (zzicVarZzr.zzt.zzv().zzae(zzgcVarZzt.zzap())) {
                        zzicVarZzr.zzt.zzv().zzO(bundle, "_dbg", 1L);
                        zzicVarZzr.zzt.zzv().zzO(bundle, "_r", 1L);
                    }
                    zzasVarZzn = zzicVarZzr.zzf.zzi().zzn(str, zzawVar.zza);
                    if (zzasVarZzn == null) {
                        zzgcVar = zzgcVarZzt;
                        z = true;
                        bundle2 = bundle;
                        zzasVarZzc = new zzas(str, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                        j = 0;
                        zzhVar = zzhVarZzj;
                        zzgaVar = zzgaVarZza;
                    } else {
                        zzgaVar = zzgaVarZza;
                        bundle2 = bundle;
                        zzhVar = zzhVarZzj;
                        zzgcVar = zzgcVarZzt;
                        z = true;
                        long j2 = zzasVarZzn.zzf;
                        zzasVarZzc = zzasVarZzn.zzc(zzawVar.zzd);
                        j = j2;
                    }
                    zzas zzasVar = zzasVarZzc;
                    zzicVarZzr.zzf.zzi().zzE(zzasVar);
                    zzh zzhVar2 = zzhVar;
                    zzgcVar2 = zzgcVar;
                    boolean z2 = z;
                    zzarVar = new zzar(zzicVarZzr.zzt, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j, bundle2);
                    zzfsVarZze = com.google.android.gms.internal.measurement.zzft.zze();
                    zzfsVarZze.zzm(zzarVar.zzd);
                    zzfsVarZze.zzi(zzarVar.zzb);
                    zzfsVarZze.zzl(zzarVar.zze);
                    zzatVar = new zzat(zzarVar.zzf);
                    while (zzatVar.hasNext()) {
                        String next = zzatVar.next();
                        zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
                        zzfwVarZze.zzj(next);
                        objZzf = zzarVar.zzf.zzf(next);
                        if (objZzf != null) {
                            zzicVarZzr.zzf.zzu().zzt(zzfwVarZze, objZzf);
                            zzfsVarZze.zze(zzfwVarZze);
                        }
                    }
                    zzgcVar2.zzk(zzfsVarZze);
                    com.google.android.gms.internal.measurement.zzge zzgeVarZza = com.google.android.gms.internal.measurement.zzgg.zza();
                    com.google.android.gms.internal.measurement.zzfu zzfuVarZza = com.google.android.gms.internal.measurement.zzfv.zza();
                    zzfuVarZza.zza(zzasVar.zzc);
                    zzfuVarZza.zzb(zzawVar.zza);
                    zzgeVarZza.zza(zzfuVarZza);
                    zzgcVar2.zzaa(zzgeVarZza);
                    zzgcVar2.zzf(zzicVarZzr.zzf.zzf().zza(zzhVar2.zzt(), Collections.EMPTY_LIST, zzgcVar2.zzat(), Long.valueOf(zzfsVarZze.zzc()), Long.valueOf(zzfsVarZze.zzc())));
                    if (zzfsVarZze.zzq()) {
                        zzgcVar2.zzai(zzfsVarZze.zzc());
                        zzgcVar2.zzQ(zzfsVarZze.zzc());
                    }
                    jZzn = zzhVar2.zzn();
                    if (jZzn != 0) {
                        zzgcVar2.zzab(jZzn);
                    }
                    jZzp = zzhVar2.zzp();
                    if (jZzp != 0) {
                        zzgcVar2.zzac(jZzp);
                    } else if (jZzn != 0) {
                        zzgcVar2.zzac(jZzn);
                    }
                    strZzB = zzhVar2.zzB();
                    zzpd.zzc();
                    if (zzicVarZzr.zzt.zzf().zzs(null, zzdu.zzal)) {
                        zzgcVar2.zzah(strZzB);
                    }
                    zzhVar2.zzE();
                    zzgcVar2.zzI((int) zzhVar2.zzo());
                    zzicVarZzr.zzt.zzf().zzh();
                    zzgcVar2.zzal(74029L);
                    zzgcVar2.zzak(zzicVarZzr.zzt.zzav().currentTimeMillis());
                    zzgcVar2.zzag(z2);
                    if (zzicVarZzr.zzt.zzf().zzs(null, zzdu.zzar)) {
                        zzicVarZzr.zzf.zzC(zzgcVar2.zzap(), zzgcVar2);
                    }
                    zzgaVar.zza(zzgcVar2);
                    zzhVar2.zzab(zzgcVar2.zzd());
                    zzhVar2.zzZ(zzgcVar2.zzc());
                    zzicVarZzr.zzf.zzi().zzD(zzhVar2);
                    zzicVarZzr.zzf.zzi().zzC();
                    zzicVarZzr.zzf.zzi().zzx();
                    return zzicVarZzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzgb) zzgaVar.zzaC()).zzbu());
                }
                try {
                    zzgcVarZzt.zzae(zzic.zza((String) pairZzd.first, Long.toString(zzawVar.zzd)));
                    Object obj = pairZzd.second;
                    if (obj != null) {
                        zzgcVarZzt.zzX(((Boolean) obj).booleanValue());
                    }
                    zzicVarZzr.zzt.zzg().zzu();
                    zzgcVarZzt.zzN(Build.MODEL);
                    zzicVarZzr.zzt.zzg().zzu();
                    zzgcVarZzt.zzY(Build.VERSION.RELEASE);
                    zzgcVarZzt.zzaj((int) zzicVarZzr.zzt.zzg().zzb());
                    zzgcVarZzt.zzan(zzicVarZzr.zzt.zzg().zzc());
                    if (zzaiVarZzh.zzi(zzah.ANALYTICS_STORAGE)) {
                        zzgcVarZzt.zzE(zzic.zza((String) Preconditions.checkNotNull(zzhVarZzj.zzu()), Long.toString(zzawVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                        zzgcVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj.zzx()));
                    }
                    strZzt = zzhVarZzj.zzt();
                    listZzu = zzicVarZzr.zzf.zzi().zzu(strZzt);
                    it = listZzu.iterator();
                    do {
                        if (!it.hasNext()) {
                            zzkyVar = null;
                            break;
                        }
                        zzkyVar = (zzky) it.next();
                    } while (!"_lte".equals(zzkyVar.zzc));
                    if (zzkyVar != null) {
                        list = listZzu;
                        zzky zzkyVar4 = new zzky(strZzt, "auto", "_lte", zzicVarZzr.zzt.zzav().currentTimeMillis(), 0L);
                        list.add(zzkyVar4);
                        zzicVarZzr.zzf.zzi().zzL(zzkyVar4);
                    } else {
                        list = listZzu;
                        zzky zzkyVar5 = new zzky(strZzt, "auto", "_lte", zzicVarZzr.zzt.zzav().currentTimeMillis(), 0L);
                        list.add(zzkyVar5);
                        zzicVarZzr.zzf.zzi().zzL(zzkyVar5);
                    }
                    zzkvVarZzu = zzicVarZzr.zzf.zzu();
                    zzkvVarZzu.zzt.zzay().zzj().zza("Checking account type status for ad personalization signals");
                    if (zzkvVarZzu.zzt.zzg().zze()) {
                        strZzt2 = zzhVarZzj.zzt();
                        Preconditions.checkNotNull(strZzt2);
                        if (zzhVarZzj.zzah()) {
                            zzkvVarZzu.zzt.zzay().zzc().zza("Turning off ad personalization due to account type");
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                if ("_npa".equals(((zzky) it2.next()).zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            list.add(new zzky(strZzt2, "auto", "_npa", zzkvVarZzu.zzt.zzav().currentTimeMillis(), 1L));
                        }
                    }
                    zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[list.size()];
                    while (i < list.size()) {
                        com.google.android.gms.internal.measurement.zzgl zzglVarZzd2 = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzglVarZzd2.zzf(((zzky) list.get(i)).zzc);
                        zzglVarZzd2.zzg(((zzky) list.get(i)).zzd);
                        zzicVarZzr.zzf.zzu().zzu(zzglVarZzd2, ((zzky) list.get(i)).zze);
                        zzgmVarArr[i] = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd2.zzaC();
                    }
                    zzgcVarZzt.zzj(Arrays.asList(zzgmVarArr));
                    zzei zzeiVarZzb2 = zzei.zzb(zzawVar);
                    zzicVarZzr.zzt.zzv().zzL(zzeiVarZzb2.zzd, zzicVarZzr.zzf.zzi().zzi(str));
                    zzicVarZzr.zzt.zzv().zzM(zzeiVarZzb2, zzicVarZzr.zzt.zzf().zzd(str));
                    bundle = zzeiVarZzb2.zzd;
                    bundle.putLong("_c", 1L);
                    zzicVarZzr.zzt.zzay().zzc().zza("Marking in-app purchase as real-time");
                    bundle.putLong("_r", 1L);
                    bundle.putString("_o", zzawVar.zzc);
                    if (zzicVarZzr.zzt.zzv().zzae(zzgcVarZzt.zzap())) {
                        zzicVarZzr.zzt.zzv().zzO(bundle, "_dbg", 1L);
                        zzicVarZzr.zzt.zzv().zzO(bundle, "_r", 1L);
                    }
                    zzasVarZzn = zzicVarZzr.zzf.zzi().zzn(str, zzawVar.zza);
                    if (zzasVarZzn == null) {
                        zzgcVar = zzgcVarZzt;
                        z = true;
                        bundle2 = bundle;
                        zzasVarZzc = new zzas(str, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                        j = 0;
                        zzhVar = zzhVarZzj;
                        zzgaVar = zzgaVarZza;
                    } else {
                        zzgaVar = zzgaVarZza;
                        bundle2 = bundle;
                        zzhVar = zzhVarZzj;
                        zzgcVar = zzgcVarZzt;
                        z = true;
                        long j3 = zzasVarZzn.zzf;
                        zzasVarZzc = zzasVarZzn.zzc(zzawVar.zzd);
                        j = j3;
                    }
                    zzas zzasVar2 = zzasVarZzc;
                    zzicVarZzr.zzf.zzi().zzE(zzasVar2);
                    zzh zzhVar3 = zzhVar;
                    zzgcVar2 = zzgcVar;
                    boolean z3 = z;
                    zzarVar = new zzar(zzicVarZzr.zzt, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j, bundle2);
                    zzfsVarZze = com.google.android.gms.internal.measurement.zzft.zze();
                    zzfsVarZze.zzm(zzarVar.zzd);
                    zzfsVarZze.zzi(zzarVar.zzb);
                    zzfsVarZze.zzl(zzarVar.zze);
                    zzatVar = new zzat(zzarVar.zzf);
                    while (zzatVar.hasNext()) {
                        String next2 = zzatVar.next();
                        zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
                        zzfwVarZze.zzj(next2);
                        objZzf = zzarVar.zzf.zzf(next2);
                        if (objZzf != null) {
                            zzicVarZzr.zzf.zzu().zzt(zzfwVarZze, objZzf);
                            zzfsVarZze.zze(zzfwVarZze);
                        }
                    }
                    zzgcVar2.zzk(zzfsVarZze);
                    com.google.android.gms.internal.measurement.zzge zzgeVarZza2 = com.google.android.gms.internal.measurement.zzgg.zza();
                    com.google.android.gms.internal.measurement.zzfu zzfuVarZza2 = com.google.android.gms.internal.measurement.zzfv.zza();
                    zzfuVarZza2.zza(zzasVar2.zzc);
                    zzfuVarZza2.zzb(zzawVar.zza);
                    zzgeVarZza2.zza(zzfuVarZza2);
                    zzgcVar2.zzaa(zzgeVarZza2);
                    zzgcVar2.zzf(zzicVarZzr.zzf.zzf().zza(zzhVar3.zzt(), Collections.EMPTY_LIST, zzgcVar2.zzat(), Long.valueOf(zzfsVarZze.zzc()), Long.valueOf(zzfsVarZze.zzc())));
                    if (zzfsVarZze.zzq()) {
                        zzgcVar2.zzai(zzfsVarZze.zzc());
                        zzgcVar2.zzQ(zzfsVarZze.zzc());
                    }
                    jZzn = zzhVar3.zzn();
                    if (jZzn != 0) {
                        zzgcVar2.zzab(jZzn);
                    }
                    jZzp = zzhVar3.zzp();
                    if (jZzp != 0) {
                        zzgcVar2.zzac(jZzp);
                    } else if (jZzn != 0) {
                        zzgcVar2.zzac(jZzn);
                    }
                    strZzB = zzhVar3.zzB();
                    zzpd.zzc();
                    if (zzicVarZzr.zzt.zzf().zzs(null, zzdu.zzal)) {
                        zzgcVar2.zzah(strZzB);
                    }
                    zzhVar3.zzE();
                    zzgcVar2.zzI((int) zzhVar3.zzo());
                    zzicVarZzr.zzt.zzf().zzh();
                    zzgcVar2.zzal(74029L);
                    zzgcVar2.zzak(zzicVarZzr.zzt.zzav().currentTimeMillis());
                    zzgcVar2.zzag(z3);
                    if (zzicVarZzr.zzt.zzf().zzs(null, zzdu.zzar)) {
                        zzicVarZzr.zzf.zzC(zzgcVar2.zzap(), zzgcVar2);
                    }
                    zzgaVar.zza(zzgcVar2);
                    zzhVar3.zzab(zzgcVar2.zzd());
                    zzhVar3.zzZ(zzgcVar2.zzc());
                    zzicVarZzr.zzf.zzi().zzD(zzhVar3);
                    zzicVarZzr.zzf.zzi().zzC();
                    zzicVarZzr.zzf.zzi().zzx();
                    return zzicVarZzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzgb) zzgaVar.zzaC()).zzbu());
                } catch (SecurityException e) {
                    zzicVarZzr.zzt.zzay().zzc().zzb("Resettable device id encryption failed", e.getMessage());
                    bArr = new byte[0];
                    zzktVar = zzicVarZzr.zzf;
                }
            } else {
                zzicVarZzr.zzt.zzg().zzu();
                zzgcVarZzt.zzN(Build.MODEL);
                zzicVarZzr.zzt.zzg().zzu();
                zzgcVarZzt.zzY(Build.VERSION.RELEASE);
                zzgcVarZzt.zzaj((int) zzicVarZzr.zzt.zzg().zzb());
                zzgcVarZzt.zzan(zzicVarZzr.zzt.zzg().zzc());
                try {
                    if (zzaiVarZzh.zzi(zzah.ANALYTICS_STORAGE) && zzhVarZzj.zzu() != null) {
                        zzgcVarZzt.zzE(zzic.zza((String) Preconditions.checkNotNull(zzhVarZzj.zzu()), Long.toString(zzawVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                        zzgcVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj.zzx()));
                    }
                    strZzt = zzhVarZzj.zzt();
                    listZzu = zzicVarZzr.zzf.zzi().zzu(strZzt);
                    it = listZzu.iterator();
                    do {
                        if (!it.hasNext()) {
                            zzkyVar = null;
                            break;
                        }
                        zzkyVar = (zzky) it.next();
                    } while (!"_lte".equals(zzkyVar.zzc));
                    if (zzkyVar != null || zzkyVar.zze == null) {
                        list = listZzu;
                        zzky zzkyVar6 = new zzky(strZzt, "auto", "_lte", zzicVarZzr.zzt.zzav().currentTimeMillis(), 0L);
                        list.add(zzkyVar6);
                        zzicVarZzr.zzf.zzi().zzL(zzkyVar6);
                    } else {
                        list = listZzu;
                    }
                    zzkvVarZzu = zzicVarZzr.zzf.zzu();
                    zzkvVarZzu.zzt.zzay().zzj().zza("Checking account type status for ad personalization signals");
                    if (zzkvVarZzu.zzt.zzg().zze()) {
                        strZzt2 = zzhVarZzj.zzt();
                        Preconditions.checkNotNull(strZzt2);
                        if (zzhVarZzj.zzah() && zzkvVarZzu.zzf.zzo().zzn(strZzt2)) {
                            zzkvVarZzu.zzt.zzay().zzc().zza("Turning off ad personalization due to account type");
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                if ("_npa".equals(((zzky) it2.next()).zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            list.add(new zzky(strZzt2, "auto", "_npa", zzkvVarZzu.zzt.zzav().currentTimeMillis(), 1L));
                        }
                    }
                    zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[list.size()];
                    while (i < list.size()) {
                        com.google.android.gms.internal.measurement.zzgl zzglVarZzd3 = com.google.android.gms.internal.measurement.zzgm.zzd();
                        zzglVarZzd3.zzf(((zzky) list.get(i)).zzc);
                        zzglVarZzd3.zzg(((zzky) list.get(i)).zzd);
                        zzicVarZzr.zzf.zzu().zzu(zzglVarZzd3, ((zzky) list.get(i)).zze);
                        zzgmVarArr[i] = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd3.zzaC();
                    }
                    zzgcVarZzt.zzj(Arrays.asList(zzgmVarArr));
                    zzei zzeiVarZzb3 = zzei.zzb(zzawVar);
                    zzicVarZzr.zzt.zzv().zzL(zzeiVarZzb3.zzd, zzicVarZzr.zzf.zzi().zzi(str));
                    zzicVarZzr.zzt.zzv().zzM(zzeiVarZzb3, zzicVarZzr.zzt.zzf().zzd(str));
                    bundle = zzeiVarZzb3.zzd;
                    bundle.putLong("_c", 1L);
                    zzicVarZzr.zzt.zzay().zzc().zza("Marking in-app purchase as real-time");
                    bundle.putLong("_r", 1L);
                    bundle.putString("_o", zzawVar.zzc);
                    if (zzicVarZzr.zzt.zzv().zzae(zzgcVarZzt.zzap())) {
                        zzicVarZzr.zzt.zzv().zzO(bundle, "_dbg", 1L);
                        zzicVarZzr.zzt.zzv().zzO(bundle, "_r", 1L);
                    }
                    zzasVarZzn = zzicVarZzr.zzf.zzi().zzn(str, zzawVar.zza);
                    if (zzasVarZzn == null) {
                        zzgcVar = zzgcVarZzt;
                        z = true;
                        bundle2 = bundle;
                        zzasVarZzc = new zzas(str, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                        j = 0;
                        zzhVar = zzhVarZzj;
                        zzgaVar = zzgaVarZza;
                    } else {
                        zzgaVar = zzgaVarZza;
                        bundle2 = bundle;
                        zzhVar = zzhVarZzj;
                        zzgcVar = zzgcVarZzt;
                        z = true;
                        long j4 = zzasVarZzn.zzf;
                        zzasVarZzc = zzasVarZzn.zzc(zzawVar.zzd);
                        j = j4;
                    }
                    zzas zzasVar3 = zzasVarZzc;
                    zzicVarZzr.zzf.zzi().zzE(zzasVar3);
                    zzh zzhVar4 = zzhVar;
                    zzgcVar2 = zzgcVar;
                    boolean z4 = z;
                    zzarVar = new zzar(zzicVarZzr.zzt, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j, bundle2);
                    zzfsVarZze = com.google.android.gms.internal.measurement.zzft.zze();
                    zzfsVarZze.zzm(zzarVar.zzd);
                    zzfsVarZze.zzi(zzarVar.zzb);
                    zzfsVarZze.zzl(zzarVar.zze);
                    zzatVar = new zzat(zzarVar.zzf);
                    while (zzatVar.hasNext()) {
                        String next3 = zzatVar.next();
                        zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
                        zzfwVarZze.zzj(next3);
                        objZzf = zzarVar.zzf.zzf(next3);
                        if (objZzf != null) {
                            zzicVarZzr.zzf.zzu().zzt(zzfwVarZze, objZzf);
                            zzfsVarZze.zze(zzfwVarZze);
                        }
                    }
                    zzgcVar2.zzk(zzfsVarZze);
                    com.google.android.gms.internal.measurement.zzge zzgeVarZza3 = com.google.android.gms.internal.measurement.zzgg.zza();
                    com.google.android.gms.internal.measurement.zzfu zzfuVarZza3 = com.google.android.gms.internal.measurement.zzfv.zza();
                    zzfuVarZza3.zza(zzasVar3.zzc);
                    zzfuVarZza3.zzb(zzawVar.zza);
                    zzgeVarZza3.zza(zzfuVarZza3);
                    zzgcVar2.zzaa(zzgeVarZza3);
                    zzgcVar2.zzf(zzicVarZzr.zzf.zzf().zza(zzhVar4.zzt(), Collections.EMPTY_LIST, zzgcVar2.zzat(), Long.valueOf(zzfsVarZze.zzc()), Long.valueOf(zzfsVarZze.zzc())));
                    if (zzfsVarZze.zzq()) {
                        zzgcVar2.zzai(zzfsVarZze.zzc());
                        zzgcVar2.zzQ(zzfsVarZze.zzc());
                    }
                    jZzn = zzhVar4.zzn();
                    if (jZzn != 0) {
                        zzgcVar2.zzab(jZzn);
                    }
                    jZzp = zzhVar4.zzp();
                    if (jZzp != 0) {
                        zzgcVar2.zzac(jZzp);
                    } else if (jZzn != 0) {
                        zzgcVar2.zzac(jZzn);
                    }
                    strZzB = zzhVar4.zzB();
                    zzpd.zzc();
                    if (zzicVarZzr.zzt.zzf().zzs(null, zzdu.zzal) && zzicVarZzr.zzt.zzf().zzs(str, zzdu.zzan) && strZzB != null) {
                        zzgcVar2.zzah(strZzB);
                    }
                    zzhVar4.zzE();
                    zzgcVar2.zzI((int) zzhVar4.zzo());
                    zzicVarZzr.zzt.zzf().zzh();
                    zzgcVar2.zzal(74029L);
                    zzgcVar2.zzak(zzicVarZzr.zzt.zzav().currentTimeMillis());
                    zzgcVar2.zzag(z4);
                    if (zzicVarZzr.zzt.zzf().zzs(null, zzdu.zzar)) {
                        zzicVarZzr.zzf.zzC(zzgcVar2.zzap(), zzgcVar2);
                    }
                    zzgaVar.zza(zzgcVar2);
                    zzhVar4.zzab(zzgcVar2.zzd());
                    zzhVar4.zzZ(zzgcVar2.zzc());
                    zzicVarZzr.zzf.zzi().zzD(zzhVar4);
                    zzicVarZzr.zzf.zzi().zzC();
                    zzicVarZzr.zzf.zzi().zzx();
                    try {
                        return zzicVarZzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzgb) zzgaVar.zzaC()).zzbu());
                    } catch (IOException e2) {
                        zzicVarZzr.zzt.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzeh.zzn(str), e2);
                        return null;
                    }
                } catch (SecurityException e3) {
                    zzicVarZzr.zzt.zzay().zzc().zzb("app instance id encryption failed", e3.getMessage());
                    bArr = new byte[0];
                    zzktVar = zzicVarZzr.zzf;
                }
            }
            zzktVar.zzi().zzx();
            return bArr;
        } catch (Throwable th) {
            zzicVarZzr.zzf.zzi().zzx();
            throw th;
        }
    }
}
