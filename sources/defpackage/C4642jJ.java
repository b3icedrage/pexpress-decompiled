package defpackage;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;

/* JADX INFO: renamed from: jJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4642jJ extends C5494nM {
    public URL h;
    public ArrayList i = new ArrayList();
    public ArrayList j = new ArrayList();

    public final void q(URL url) {
        File file;
        if ("file".equals(url.getProtocol())) {
            file = new File(URLDecoder.decode(url.getFile()));
        } else {
            n("URL [" + url + "] is not of type file");
            file = null;
        }
        if (file != null) {
            this.i.add(file);
            this.j.add(Long.valueOf(file.lastModified()));
        }
    }
}
