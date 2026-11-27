package io.sentry.protocol;

import defpackage.BH0;
import defpackage.C6319rH0;
import defpackage.KG0;
import defpackage.Q71;
import defpackage.W71;
import io.sentry.ILogger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DebugImage implements BH0 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";

    @Nullable
    private String arch;

    @Nullable
    private String codeFile;

    @Nullable
    private String codeId;

    @Nullable
    private String debugFile;

    @Nullable
    private String debugId;

    @Nullable
    private String imageAddr;

    @Nullable
    private Long imageSize;

    @Nullable
    private String type;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private String uuid;

    public static final class a implements KG0<DebugImage> {
        @Override // defpackage.KG0
        @NotNull
        public final DebugImage a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            DebugImage debugImage = new DebugImage();
            q71.X0();
            HashMap map = null;
            while (q71.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strX0 = q71.x0();
                strX0.getClass();
                switch (strX0) {
                    case "debug_file":
                        debugImage.debugFile = q71.e0();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = q71.e0();
                        break;
                    case "image_size":
                        debugImage.imageSize = q71.R();
                        break;
                    case "code_file":
                        debugImage.codeFile = q71.e0();
                        break;
                    case "arch":
                        debugImage.arch = q71.e0();
                        break;
                    case "type":
                        debugImage.type = q71.e0();
                        break;
                    case "uuid":
                        debugImage.uuid = q71.e0();
                        break;
                    case "debug_id":
                        debugImage.debugId = q71.e0();
                        break;
                    case "code_id":
                        debugImage.codeId = q71.e0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        q71.Q(iLogger, map, strX0);
                        break;
                }
            }
            q71.B0();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    @Nullable
    public String getArch() {
        return this.arch;
    }

    @Nullable
    public String getCodeFile() {
        return this.codeFile;
    }

    @Nullable
    public String getCodeId() {
        return this.codeId;
    }

    @Nullable
    public String getDebugFile() {
        return this.debugFile;
    }

    @Nullable
    public String getDebugId() {
        return this.debugId;
    }

    @Nullable
    public String getImageAddr() {
        return this.imageAddr;
    }

    @Nullable
    public Long getImageSize() {
        return this.imageSize;
    }

    @Nullable
    public String getType() {
        return this.type;
    }

    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public String getUuid() {
        return this.uuid;
    }

    @Override // defpackage.BH0
    public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) throws IOException {
        C6319rH0 c6319rH0 = (C6319rH0) w71;
        c6319rH0.a();
        if (this.uuid != null) {
            c6319rH0.c("uuid");
            c6319rH0.j(this.uuid);
        }
        if (this.type != null) {
            c6319rH0.c("type");
            c6319rH0.j(this.type);
        }
        if (this.debugId != null) {
            c6319rH0.c("debug_id");
            c6319rH0.j(this.debugId);
        }
        if (this.debugFile != null) {
            c6319rH0.c("debug_file");
            c6319rH0.j(this.debugFile);
        }
        if (this.codeId != null) {
            c6319rH0.c("code_id");
            c6319rH0.j(this.codeId);
        }
        if (this.codeFile != null) {
            c6319rH0.c("code_file");
            c6319rH0.j(this.codeFile);
        }
        if (this.imageAddr != null) {
            c6319rH0.c("image_addr");
            c6319rH0.j(this.imageAddr);
        }
        if (this.imageSize != null) {
            c6319rH0.c("image_size");
            c6319rH0.i(this.imageSize);
        }
        if (this.arch != null) {
            c6319rH0.c("arch");
            c6319rH0.j(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                c6319rH0.c(str);
                c6319rH0.g(iLogger, obj);
            }
        }
        c6319rH0.b();
    }

    public void setArch(@Nullable String str) {
        this.arch = str;
    }

    public void setCodeFile(@Nullable String str) {
        this.codeFile = str;
    }

    public void setCodeId(@Nullable String str) {
        this.codeId = str;
    }

    public void setDebugFile(@Nullable String str) {
        this.debugFile = str;
    }

    public void setDebugId(@Nullable String str) {
        this.debugId = str;
    }

    public void setImageAddr(@Nullable String str) {
        this.imageAddr = str;
    }

    public void setImageSize(@Nullable Long l) {
        this.imageSize = l;
    }

    public void setType(@Nullable String str) {
        this.type = str;
    }

    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(@Nullable String str) {
        this.uuid = str;
    }

    public void setImageSize(long j) {
        this.imageSize = Long.valueOf(j);
    }
}
