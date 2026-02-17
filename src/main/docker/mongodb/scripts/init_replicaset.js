var status = rs.status();
if (status.errmsg === 'no replset config has been received') {
  rs.initiate();
}
for (var i = 1; i <= param; i++) {
  if (i!==1)
<<<<<<< Updated upstream
    rs.add(folder+"_asdad-mongodb-node_" + i + ":27018");
}
var cfg = rs.conf();
cfg.members[0].host = folder+"_asdad-mongodb-node_1:27018";
=======
    rs.add(folder+"_dsadadad-mongodb-node_" + i + ":27018");
}
var cfg = rs.conf();
cfg.members[0].host = folder+"_dsadadad-mongodb-node_1:27018";
>>>>>>> Stashed changes
rs.reconfig(cfg);
