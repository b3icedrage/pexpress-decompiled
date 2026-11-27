package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.ID;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class zzfg extends zzbu {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfq zzc;

    public zzfg(zzbx zzbxVar) {
        super(zzbxVar);
        String str = zzbv.zza;
        String str2 = Build.VERSION.RELEASE;
        String strZzd = zzfu.zzd(Locale.getDefault());
        String str3 = Build.MODEL;
        String str4 = Build.ID;
        StringBuilder sbA = C5896pG.a("GoogleAnalytics/", str, " (Linux; U; Android ", str2, "; ");
        C5896pG.b(sbA, strZzd, "; ", str3, " Build/");
        this.zzb = C5807oq.b(sbA, str4, ")");
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v8 */
    private final int zzg(URL url, byte[] bArr, int i) throws Throwable {
        ?? r4;
        HttpURLConnection httpURLConnectionZzb;
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        zzG("POST bytes, url", Integer.valueOf(length), url);
        if (zzbt.zzU()) {
            zzO("Post payload\n", new String(bArr));
        }
        OutputStream outputStream = null;
        try {
            try {
                httpURLConnectionZzb = zzb(url);
                try {
                    httpURLConnectionZzb.setDoOutput(true);
                    httpURLConnectionZzb.setFixedLengthStreamingMode(length);
                    httpURLConnectionZzb.connect();
                    outputStream = httpURLConnectionZzb.getOutputStream();
                    outputStream.write(bArr);
                    zzk(httpURLConnectionZzb);
                    int responseCode = httpURLConnectionZzb.getResponseCode();
                    if (responseCode == 200) {
                        zzs().zzi();
                        responseCode = 200;
                    }
                    zzF("POST status", Integer.valueOf(responseCode));
                    try {
                        outputStream.close();
                    } catch (IOException e) {
                        zzJ("Error closing http post connection output stream", e);
                    }
                    httpURLConnectionZzb.disconnect();
                    return responseCode;
                } catch (IOException e2) {
                    e = e2;
                    zzR("Network POST connection error", e);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e3) {
                            zzJ("Error closing http post connection output stream", e3);
                        }
                    }
                    if (httpURLConnectionZzb == null) {
                        return 0;
                    }
                    httpURLConnectionZzb.disconnect();
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                r4 = url;
                if (0 != 0) {
                    try {
                        outputStream.close();
                    } catch (IOException e4) {
                        zzJ("Error closing http post connection output stream", e4);
                    }
                }
                if (r4 != 0) {
                    throw th;
                }
                r4.disconnect();
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnectionZzb = null;
        } catch (Throwable th2) {
            th = th2;
            r4 = 0;
            if (0 != 0) {
                outputStream.close();
            }
            if (r4 != 0) {
                throw th;
            }
            r4.disconnect();
            throw th;
        }
    }

    private final URL zzh() {
        zzw();
        String strZzi = zzcv.zzi();
        zzw();
        try {
            return new URL(strZzi.concat((String) zzew.zzt.zzb()));
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzi(zzez zzezVar) {
        String strConcat;
        if (zzezVar.zzh()) {
            zzw();
            String strZzi = zzcv.zzi();
            zzw();
            strConcat = strZzi.concat(zzcv.zzj());
        } else {
            zzw();
            String strZzk = zzcv.zzk();
            zzw();
            strConcat = strZzk.concat(zzcv.zzj());
        }
        try {
            return new URL(strConcat);
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzj(zzez zzezVar, String str) {
        String strC;
        if (zzezVar.zzh()) {
            zzw();
            String strZzi = zzcv.zzi();
            zzw();
            strC = ID.c(strZzi, zzcv.zzj(), "?", str);
        } else {
            zzw();
            String strZzk = zzcv.zzk();
            zzw();
            strC = ID.c(strZzk, zzcv.zzj(), "?", str);
        }
        try {
            return new URL(strC);
        } catch (MalformedURLException e) {
            zzJ("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        zzJ("Error closing http connection input stream", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk(java.net.HttpURLConnection r4) throws java.lang.Throwable {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1b
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L19
        La:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 > 0) goto La
            r4.close()     // Catch: java.io.IOException -> L14
            return
        L14:
            r4 = move-exception
            r3.zzJ(r0, r4)
            return
        L19:
            r1 = move-exception
            goto L1d
        L1b:
            r1 = move-exception
            r4 = 0
        L1d:
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.io.IOException -> L23
            goto L27
        L23:
            r4 = move-exception
            r3.zzJ(r0, r4)
        L27:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzk(java.net.HttpURLConnection):void");
    }

    private static final void zzl(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    public final String zza(zzez zzezVar, boolean z) {
        Preconditions.checkNotNull(zzezVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : zzezVar.zzg().entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    zzl(sb, str, (String) entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzezVar.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().currentTimeMillis() - zzezVar.zzd()));
            zzw();
            if (z) {
                long jZzc = zzezVar.zzc();
                zzl(sb, "z", jZzc != 0 ? String.valueOf(jZzc) : String.valueOf(zzezVar.zzb()));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zzJ("Failed to encode name or value", e);
            return null;
        }
    }

    public final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        zzw();
        httpURLConnection.setConnectTimeout(((Integer) zzew.zzE.zzb()).intValue());
        zzw();
        httpURLConnection.setReadTimeout(((Integer) zzew.zzF.zzb()).intValue());
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", this.zzb);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:106:0x0210  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0322 A[EDGE_INSN: B:190:0x0322->B:162:0x0322 BREAK  A[LOOP:1: B:110:0x022a->B:193:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[LOOP:1: B:110:0x022a->B:193:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0037  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    public final List zzc(List list) throws Throwable {
        boolean z;
        boolean z2;
        HttpURLConnection httpURLConnection;
        int size;
        int iZzg;
        Integer numValueOf;
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnectionZzb;
        Throwable th2;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        Preconditions.checkNotNull(list);
        if (zzw().zza().isEmpty()) {
            z = false;
            z2 = false;
        } else {
            zzfq zzfqVar = this.zzc;
            zzw();
            if (zzfqVar.zzc(((long) ((Integer) zzew.zzC.zzb()).intValue()) * 1000)) {
                zzw();
                String str = (String) zzew.zzv.zzb();
                z = "BATCH_BY_SESSION".equalsIgnoreCase(str) || "BATCH_BY_TIME".equalsIgnoreCase(str) || "BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(str) || "BATCH_BY_COUNT".equalsIgnoreCase(str) || "BATCH_BY_SIZE".equalsIgnoreCase(str);
                zzw();
                if (true == "GZIP".equalsIgnoreCase((String) zzew.zzw.zzb())) {
                    z2 = true;
                }
            } else {
                z = false;
            }
            z2 = false;
        }
        if (!z) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzez zzezVar = (zzez) it.next();
                Preconditions.checkNotNull(zzezVar);
                String strZza = zza(zzezVar, !zzezVar.zzh());
                if (strZza == null) {
                    zzz().zzb(zzezVar, "Error formatting hit for upload");
                } else {
                    zzw();
                    if (strZza.length() <= ((Integer) zzew.zzu.zzb()).intValue()) {
                        URL urlZzj = zzj(zzezVar, strZza);
                        if (urlZzj == null) {
                            zzI("Failed to build collect GET endpoint url");
                            return arrayList;
                        }
                        Preconditions.checkNotNull(urlZzj);
                        zzF("GET request", urlZzj);
                        try {
                            HttpURLConnection httpURLConnectionZzb2 = zzb(urlZzj);
                            try {
                                httpURLConnectionZzb2.connect();
                                zzk(httpURLConnectionZzb2);
                                int responseCode = httpURLConnectionZzb2.getResponseCode();
                                if (responseCode == 200) {
                                    zzs().zzi();
                                    responseCode = 200;
                                }
                                zzF("GET status", Integer.valueOf(responseCode));
                                httpURLConnectionZzb2.disconnect();
                                if (responseCode != 200) {
                                    break;
                                }
                            } catch (IOException e) {
                                e = e;
                                httpURLConnection = httpURLConnectionZzb2;
                                try {
                                    zzR("Network GET connection error", e);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                httpURLConnection = httpURLConnectionZzb2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            httpURLConnection = null;
                        } catch (Throwable th5) {
                            th = th5;
                            httpURLConnection = null;
                        }
                    } else {
                        String strZza2 = zza(zzezVar, false);
                        if (strZza2 != null) {
                            byte[] bytes = strZza2.getBytes();
                            int length = bytes.length;
                            zzw();
                            if (length <= ((Integer) zzew.zzz.zzb()).intValue()) {
                                URL urlZzi = zzi(zzezVar);
                                if (urlZzi != null) {
                                    if (zzg(urlZzi, bytes, zzezVar.zza()) != 200) {
                                        break;
                                    }
                                } else {
                                    zzI("Failed to build collect POST endpoint url");
                                    return arrayList;
                                }
                            } else {
                                zzz().zzb(zzezVar, "Hit payload exceeds size limit");
                            }
                        } else {
                            zzz().zzb(zzezVar, "Error formatting hit for POST upload");
                        }
                        arrayList.add(Long.valueOf(zzezVar.zzb()));
                        size = arrayList.size();
                        zzw();
                        if (size >= zzcv.zzh()) {
                            break;
                        }
                    }
                }
                arrayList.add(Long.valueOf(zzezVar.zzb()));
                size = arrayList.size();
                zzw();
                if (size >= zzcv.zzh()) {
                    break;
                    break;
                }
            }
            return arrayList;
        }
        Preconditions.checkArgument(!list.isEmpty());
        zzP("Uploading batched hits. compression, count", Boolean.valueOf(z2), Integer.valueOf(list.size()));
        zzff zzffVar = new zzff(this);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        int iZza = 0;
        while (it2.hasNext()) {
            zzez zzezVar2 = (zzez) it2.next();
            if (!zzffVar.zzb(zzezVar2)) {
                break;
            }
            arrayList2.add(Long.valueOf(zzezVar2.zzb()));
            if (iZza <= 0) {
                iZza = zzezVar2.zza();
            }
        }
        if (zzffVar.zza() == 0) {
            return arrayList2;
        }
        URL urlZzh = zzh();
        if (urlZzh == null) {
            zzI("Failed to build batching endpoint url");
            return Collections.EMPTY_LIST;
        }
        if (z2) {
            byte[] bArrZzc = zzffVar.zzc();
            Preconditions.checkNotNull(urlZzh);
            Preconditions.checkNotNull(bArrZzc);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArrZzc);
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length2 = byteArray.length;
                Integer numValueOf2 = Integer.valueOf(length2);
                int length3 = bArrZzc.length;
                zzH("POST compressed size, ratio %, url", numValueOf2, Long.valueOf((((long) length2) * 100) / ((long) length3)), urlZzh);
                if (length2 > length3) {
                    zzS("Compressed payload is larger then uncompressed. compressed, uncompressed", numValueOf2, Integer.valueOf(length3));
                }
                if (zzbt.zzU()) {
                    zzO("Post payload", "\n" + new String(bArrZzc));
                }
                httpURLConnectionZzb = zzb(urlZzh);
                try {
                    httpURLConnectionZzb.setDoOutput(true);
                    httpURLConnectionZzb.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnectionZzb.setFixedLengthStreamingMode(length2);
                    httpURLConnectionZzb.connect();
                    OutputStream outputStream2 = httpURLConnectionZzb.getOutputStream();
                    try {
                        outputStream2.write(byteArray);
                        outputStream2.close();
                        zzk(httpURLConnectionZzb);
                        int responseCode2 = httpURLConnectionZzb.getResponseCode();
                        if (responseCode2 == 200) {
                            zzs().zzi();
                            responseCode2 = 200;
                        }
                        zzF("POST status", Integer.valueOf(responseCode2));
                        httpURLConnectionZzb.disconnect();
                        iZzg = responseCode2;
                    } catch (IOException e3) {
                        e = e3;
                        outputStream = outputStream2;
                        try {
                            zzR("Network compressed POST connection error", e);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e4) {
                                    zzJ("Error closing http compressed post connection output stream", e4);
                                }
                            }
                            if (httpURLConnectionZzb != null) {
                                httpURLConnectionZzb.disconnect();
                            }
                            iZzg = 0;
                        } catch (Throwable th6) {
                            th2 = th6;
                            httpURLConnection2 = httpURLConnectionZzb;
                            th = th2;
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e5) {
                                    zzJ("Error closing http compressed post connection output stream", e5);
                                }
                            }
                            if (httpURLConnection2 == null) {
                                throw th;
                            }
                            httpURLConnection2.disconnect();
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        httpURLConnection2 = httpURLConnectionZzb;
                        outputStream = outputStream2;
                        th = th2;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection2 == null) {
                            throw th;
                        }
                        httpURLConnection2.disconnect();
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    outputStream = null;
                    zzR("Network compressed POST connection error", e);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnectionZzb != null) {
                        httpURLConnectionZzb.disconnect();
                    }
                    iZzg = 0;
                    if (iZzg == 200) {
                        zzO("Batched upload completed. Hits batched", Integer.valueOf(zzffVar.zza()));
                        return arrayList2;
                    }
                    numValueOf = Integer.valueOf(iZzg);
                    zzO("Network error uploading hits. status code", numValueOf);
                    if (zzw().zza().contains(numValueOf)) {
                        zzQ("Server instructed the client to stop batching");
                        this.zzc.zzb();
                    }
                    return Collections.EMPTY_LIST;
                } catch (Throwable th8) {
                    th2 = th8;
                    httpURLConnection2 = httpURLConnectionZzb;
                    outputStream = null;
                }
            } catch (IOException e7) {
                e = e7;
                httpURLConnectionZzb = null;
            } catch (Throwable th9) {
                th = th9;
                outputStream = null;
                httpURLConnection2 = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection2 == null) {
                    throw th;
                }
                httpURLConnection2.disconnect();
                throw th;
            }
        } else {
            iZzg = zzg(urlZzh, zzffVar.zzc(), iZza);
        }
        if (iZzg == 200) {
            zzO("Batched upload completed. Hits batched", Integer.valueOf(zzffVar.zza()));
            return arrayList2;
        }
        numValueOf = Integer.valueOf(iZzg);
        zzO("Network error uploading hits. status code", numValueOf);
        if (zzw().zza().contains(numValueOf)) {
            zzQ("Server instructed the client to stop batching");
            this.zzc.zzb();
        }
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    public final void zzd() {
        zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo activeNetworkInfo;
        com.google.android.gms.analytics.zzr.zzh();
        zzV();
        try {
            activeNetworkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzN("No network connectivity");
        return false;
    }
}
